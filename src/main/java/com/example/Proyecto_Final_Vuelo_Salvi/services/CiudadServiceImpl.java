package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Ciudad;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.BaseRepository;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadServiceImpl extends BaseServiceImpl<Ciudad,Long> implements CiudadService{
    @Autowired
    private CiudadRepository ciudadRepository;

    public CiudadServiceImpl(BaseRepository<Ciudad, Long> baseRepository, CiudadRepository ciudadRepository) {
        super(baseRepository);
        this.ciudadRepository = ciudadRepository;
    }

    @Override
    public List<Ciudad> search(String filtro) throws Exception {
        try {
            List<Ciudad> ciudades = ciudadRepository.findByNombreCiudadContaining(filtro);
            return ciudades;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Ciudad> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Ciudad> ciudades = ciudadRepository.findByNombreCiudadContaining(filtro, pageable);
            return ciudades;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
