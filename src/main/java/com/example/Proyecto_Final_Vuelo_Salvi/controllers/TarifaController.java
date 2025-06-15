package com.example.Proyecto_Final_Vuelo_Salvi.controllers;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Tarifa;
import com.example.Proyecto_Final_Vuelo_Salvi.services.TarifaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/tarifas")
public class TarifaController extends BaseControllerImpl<Tarifa, TarifaServiceImpl>{
}
