package com.example.Proyecto_Final_Vuelo_Salvi.controllers;

import com.example.Proyecto_Final_Vuelo_Salvi.dto.VueloDTO;
import com.example.Proyecto_Final_Vuelo_Salvi.entities.Vuelo;
import com.example.Proyecto_Final_Vuelo_Salvi.services.VueloServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/vuelos")
public class VueloController extends BaseControllerImpl<Vuelo, VueloServiceImpl> {
    private final VueloServiceImpl vueloService;

    public VueloController(VueloServiceImpl vueloService) {
        this.vueloService = vueloService;
    }

    @GetMapping("/dto")
    public ResponseEntity<List<VueloDTO>> listarVuelos() {
        return ResponseEntity.ok(vueloService.obtenerTodosLosVuelosDTO());
    }
}
