package com.example.Proyecto_Final_Vuelo_Salvi.dto;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Clase;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TarifaDTO {
    private String claseTarifa;
    private int precioTarifa;
    private int impuestoTarifa;
}

