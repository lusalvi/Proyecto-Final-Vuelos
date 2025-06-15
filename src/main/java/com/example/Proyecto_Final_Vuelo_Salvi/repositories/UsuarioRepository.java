package com.example.Proyecto_Final_Vuelo_Salvi.repositories;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
    List<Usuario> findByNombreContaining(String nombre);

    Page<Usuario> findByNombreContaining(String nombre, Pageable pageable);

    Optional<Usuario> findByDni(int dni);
}
