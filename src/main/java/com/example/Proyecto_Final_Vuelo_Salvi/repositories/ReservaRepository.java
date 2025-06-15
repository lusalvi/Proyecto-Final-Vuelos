package com.example.Proyecto_Final_Vuelo_Salvi.repositories;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Reserva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository extends BaseRepository<Reserva, Long> {
    @Query("SELECT r FROM Reserva r WHERE r.tarjeta.usuario.dni = :dni")
    List<Reserva> findByDniUsuario(@Param("dni") int dni);

}
