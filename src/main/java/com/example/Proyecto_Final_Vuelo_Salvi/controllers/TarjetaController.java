package com.example.Proyecto_Final_Vuelo_Salvi.controllers;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Tarjeta;
import com.example.Proyecto_Final_Vuelo_Salvi.services.TarjetaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/tarjetas")
public class TarjetaController extends BaseControllerImpl<Tarjeta, TarjetaServiceImpl> {
}
