package com.example.Proyecto_Final_Vuelo_Salvi.repositories;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Aerolinea;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AerolineaRepository extends BaseRepository<Aerolinea, Long> {
    List<Aerolinea> findByNombreAerolineaContaining(String nombre);

    Page<Aerolinea> findByNombreAerolineaContaining(String nombre, Pageable pageable);
}
