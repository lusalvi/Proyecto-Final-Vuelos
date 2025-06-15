package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.dto.FormularioReservaDTO;
import com.example.Proyecto_Final_Vuelo_Salvi.dto.ReservaDTO;
import com.example.Proyecto_Final_Vuelo_Salvi.entities.*;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl extends BaseServiceImpl<Reserva,Long> implements ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;
    private UsuarioRepository usuarioRepository;
    private TarjetaRepository tarjetaRepository;
    private VueloRepository vueloRepository;

    public ReservaServiceImpl(BaseRepository<Reserva, Long> baseRepository, VueloRepository vueloRepository, TarjetaRepository tarjetaRepository, UsuarioRepository usuarioRepository, ReservaRepository reservaRepository) {
        super(baseRepository);
        this.vueloRepository = vueloRepository;
        this.tarjetaRepository = tarjetaRepository;
        this.usuarioRepository = usuarioRepository;
        this.reservaRepository = reservaRepository;
    }

    @Override
    public List<ReservaDTO> obtenerReservasDTO() {
        return reservaRepository.findAll().stream()
                .map(this::convertirAReservaDTO)
                .toList();
    }

    @Override
    public void crearReserva(FormularioReservaDTO dto) {
        Usuario usuario = usuarioRepository.findByDni(dto.getDni())
                .orElseGet(() -> {
                    Usuario nuevo = new Usuario();
                    nuevo.setNombre(dto.getNombre());
                    nuevo.setApellido(dto.getApellido());
                    nuevo.setDni(dto.getDni());
                    nuevo.setCorreoElectronicoUsuario(dto.getCorreo());
                    nuevo.setContrasenia(dto.getContrasenia());
                    return usuarioRepository.save(nuevo);
                });

        // Crear tarjeta
        Tarjeta tarjeta = new Tarjeta();
        tarjeta.setTipoTarjeta(TipoTarjeta.valueOf(dto.getTipoTarjeta().toUpperCase()));
        tarjeta.setNumeroTarjeta(dto.getNumeroTarjeta());
        tarjeta.setCantidadPago(dto.getCantidadPago());
        tarjeta.setUsuario(usuario);
        tarjetaRepository.save(tarjeta);

        // Buscar vuelo
        Vuelo vuelo = vueloRepository.findById(dto.getIdVuelo())
                .orElseThrow(() -> new RuntimeException("Vuelo no encontrado"));

        // Crear reserva
        Reserva reserva = new Reserva();
        reserva.setTarjeta(tarjeta);
        reserva.setVueloReservado(vuelo);
        reservaRepository.save(reserva);
    }

    @Override
    public List<ReservaDTO> obtenerReservasPorDni(int dni) {
        List<Reserva> reservas = reservaRepository.findByDniUsuario(dni);
        return reservas.stream()
                .map(this::convertirAReservaDTO)
                .toList();
    }

    private ReservaDTO convertirAReservaDTO(Reserva reserva) {
        ReservaDTO dto = new ReservaDTO();

        Vuelo vuelo = reserva.getVueloReservado();
        dto.setAerolinea(vuelo.getAerolinea().getNombreAerolinea());
        dto.setFecha(vuelo.getFecha());

        Tarjeta tarjeta = reserva.getTarjeta();
        dto.setPrecioTotal(tarjeta.getCantidadPago());

        return dto;
    }
}
