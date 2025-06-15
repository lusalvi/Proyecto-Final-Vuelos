package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Aerolinea;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AerolineaService extends BaseService<Aerolinea,Long> {
    List<Aerolinea> search(String filtro) throws Exception;

    Page<Aerolinea> search(String filtro, Pageable pageable) throws Exception;
}
