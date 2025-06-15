package com.example.Proyecto_Final_Vuelo_Salvi.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class VueloDTO {
    private Long id;
    private LocalDate fecha;
    private String aerolinea;
    private List<String> aeropuertos; // o incluso String origen + String destino si sabés cuáles son
    private List<TarifaDTO> tarifas;
}

