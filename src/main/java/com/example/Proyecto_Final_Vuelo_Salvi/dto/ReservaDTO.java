package com.example.Proyecto_Final_Vuelo_Salvi.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ReservaDTO {
    private String aerolinea;
    private LocalDate fecha;
    private int precioTotal;
}


