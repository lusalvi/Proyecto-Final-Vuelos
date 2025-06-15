package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Aerolinea;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.AerolineaRepository;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AerolineaServiceImpl extends BaseServiceImpl<Aerolinea,Long> implements AerolineaService{
    @Autowired
    private AerolineaRepository aerolineaRepository;

    public AerolineaServiceImpl(BaseRepository<Aerolinea, Long> baseRepository, AerolineaRepository aerolineaRepository) {
        super(baseRepository);
        this.aerolineaRepository = aerolineaRepository;
    }


    @Override
    public List<Aerolinea> search(String filtro) throws Exception {
        try {
            List<Aerolinea> aerolineas = aerolineaRepository.findByNombreAerolineaContaining(filtro);
            return aerolineas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Aerolinea> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Aerolinea> aerolineas = aerolineaRepository.findByNombreAerolineaContaining(filtro, pageable);
            return aerolineas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
