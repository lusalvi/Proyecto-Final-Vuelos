package com.example.Proyecto_Final_Vuelo_Salvi.repositories;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Aeropuerto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AeropuertoRepository extends BaseRepository<Aeropuerto,Long> {
    List<Aeropuerto> findByNombreAeropuertoContaining(String nombre);

    Page<Aeropuerto> findByNombreAeropuertoContaining(String nombre, Pageable pageable);
}
