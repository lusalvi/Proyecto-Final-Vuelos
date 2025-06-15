package com.example.Proyecto_Final_Vuelo_Salvi.repositories;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Ciudad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CiudadRepository extends BaseRepository<Ciudad, Long> {
    List<Ciudad> findByNombreCiudadContaining(String nombre);

    Page<Ciudad> findByNombreCiudadContaining(String nombre, Pageable pageable);
}
