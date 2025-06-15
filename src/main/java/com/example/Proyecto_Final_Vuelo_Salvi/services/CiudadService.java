package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Ciudad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CiudadService extends BaseService<Ciudad,Long> {
    List<Ciudad> search(String filtro) throws Exception;

    Page<Ciudad> search(String filtro, Pageable pageable) throws Exception;
}
