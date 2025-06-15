package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Aeropuerto;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.AeropuertoRepository;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AeropuertoServiceImpl extends BaseServiceImpl<Aeropuerto,Long> implements AeropuertoService {
    @Autowired
    private AeropuertoRepository aeropuertoRepository;

    public AeropuertoServiceImpl(BaseRepository<Aeropuerto, Long> baseRepository, AeropuertoRepository aeropuertoRepository) {
        super(baseRepository);
        this.aeropuertoRepository = aeropuertoRepository;
    }

    @Override
    public List<Aeropuerto> search(String filtro) throws Exception {
        try {
            List<Aeropuerto> aeropuertos = aeropuertoRepository.findByNombreAeropuertoContaining(filtro);
            return aeropuertos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Aeropuerto> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Aeropuerto> aeropuertos = aeropuertoRepository.findByNombreAeropuertoContaining(filtro, pageable);
            return aeropuertos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
