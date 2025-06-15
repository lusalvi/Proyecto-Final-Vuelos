package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.dto.FormularioReservaDTO;
import com.example.Proyecto_Final_Vuelo_Salvi.dto.ReservaDTO;
import com.example.Proyecto_Final_Vuelo_Salvi.entities.Reserva;

import java.util.List;

public interface ReservaService extends BaseService<Reserva,Long> {
    List<ReservaDTO> obtenerReservasDTO();
    void crearReserva(FormularioReservaDTO dto);
    List<ReservaDTO> obtenerReservasPorDni(int dni);
}
