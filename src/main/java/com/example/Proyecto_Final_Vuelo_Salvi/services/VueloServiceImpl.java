package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.dto.TarifaDTO;
import com.example.Proyecto_Final_Vuelo_Salvi.dto.VueloDTO;
import com.example.Proyecto_Final_Vuelo_Salvi.entities.Aeropuerto;
import com.example.Proyecto_Final_Vuelo_Salvi.entities.Clase;
import com.example.Proyecto_Final_Vuelo_Salvi.entities.Tarifa;
import com.example.Proyecto_Final_Vuelo_Salvi.entities.Vuelo;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.BaseRepository;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VueloServiceImpl extends BaseServiceImpl<Vuelo,Long> implements VueloService{
    @Autowired
    private VueloRepository vueloRepository;

    public VueloServiceImpl(BaseRepository<Vuelo, Long> baseRepository, VueloRepository vueloRepository) {
        super(baseRepository);
        this.vueloRepository = vueloRepository;
    }


    @Override
    public List<VueloDTO> obtenerTodosLosVuelosDTO() {
        List<Vuelo> vuelos = vueloRepository.findAll();

        return vuelos.stream().map(v -> {
            VueloDTO dto = new VueloDTO();
            dto.setId(v.getId());
            dto.setFecha(LocalDate.parse(v.getFecha().toString()));
            dto.setAerolinea(v.getAerolinea().getNombreAerolinea());
            dto.setAeropuertos(v.getAeropuertos().stream()
                    .map(Aeropuerto::getNombreAeropuerto)
                    .collect(Collectors.toList()));
            dto.setTarifas(v.getTarifas().stream()
                    .map(t -> {
                        TarifaDTO tDto = new TarifaDTO();
                        tDto.setClaseTarifa(String.valueOf(Clase.valueOf(t.getClaseTarifa().toString())));
                        tDto.setPrecioTarifa(t.getPrecioTarifa());
                        tDto.setImpuestoTarifa(t.getImpuestoTarifa());
                        return tDto;
                    }).collect(Collectors.toList()));
            return dto;
        }).collect(Collectors.toList());
    }

    private VueloDTO convertirAVueloDTO(Vuelo vuelo) {
        VueloDTO dto = new VueloDTO();
        dto.setId(vuelo.getId());
        dto.setFecha(vuelo.getFecha());
        dto.setAerolinea(vuelo.getAerolinea().getNombreAerolinea());
        dto.setAeropuertos(
                vuelo.getAeropuertos().stream()
                        .map(Aeropuerto::getNombreAeropuerto)
                        .toList()
        );
        dto.setTarifas(
                vuelo.getTarifas().stream()
                        .map(this::convertirATarifaDTO)
                        .toList()
        );
        return dto;
    }

    private TarifaDTO convertirATarifaDTO(Tarifa tarifa) {
        TarifaDTO dto = new TarifaDTO();
        dto.setClaseTarifa(String.valueOf(tarifa.getClaseTarifa()));
        dto.setPrecioTarifa(tarifa.getPrecioTarifa());
        dto.setImpuestoTarifa(tarifa.getImpuestoTarifa());
        return dto;
    }
}
