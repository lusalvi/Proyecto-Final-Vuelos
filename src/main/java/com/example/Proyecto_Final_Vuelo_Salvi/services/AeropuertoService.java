package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Aeropuerto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AeropuertoService extends BaseService<Aeropuerto,Long> {
    List<Aeropuerto> search(String filtro) throws Exception;

    Page<Aeropuerto> search(String filtro, Pageable pageable) throws Exception;
}
