package com.example.Proyecto_Final_Vuelo_Salvi.controllers;

import com.example.Proyecto_Final_Vuelo_Salvi.dto.FormularioReservaDTO;
import com.example.Proyecto_Final_Vuelo_Salvi.dto.ReservaDTO;
import com.example.Proyecto_Final_Vuelo_Salvi.entities.Reserva;
import com.example.Proyecto_Final_Vuelo_Salvi.services.ReservaService;
import com.example.Proyecto_Final_Vuelo_Salvi.services.ReservaServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/reservas")
public class ReservaController extends BaseControllerImpl<Reserva, ReservaServiceImpl> {

    private final ReservaServiceImpl reservaService;

    public ReservaController(ReservaServiceImpl reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping("/crear") // ruta distinta
    public ResponseEntity<String> crearReserva(@RequestBody FormularioReservaDTO dto) {
        reservaService.crearReserva(dto);
        return ResponseEntity.ok("Reserva creada");
    }

    @GetMapping("/por-dni") // ruta distinta
    public List<ReservaDTO> obtenerPorDni(@RequestParam int dni) {
        return reservaService.obtenerReservasPorDni(dni);
    }

}
