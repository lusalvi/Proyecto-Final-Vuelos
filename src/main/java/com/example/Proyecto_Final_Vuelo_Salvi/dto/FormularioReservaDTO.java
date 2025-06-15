package com.example.Proyecto_Final_Vuelo_Salvi.dto;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.TipoTarjeta;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormularioReservaDTO {
    private Long idVuelo;

    private int dni;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private String tipoTarjeta;
    private long numeroTarjeta;
    private int cantidadPago;
}
