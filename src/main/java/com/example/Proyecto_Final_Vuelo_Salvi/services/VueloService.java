package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.dto.VueloDTO;
import com.example.Proyecto_Final_Vuelo_Salvi.entities.Vuelo;

import java.util.List;

public interface VueloService extends BaseService<Vuelo,Long> {
    List<VueloDTO> obtenerTodosLosVuelosDTO();
}
