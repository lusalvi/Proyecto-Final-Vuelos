package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Tarjeta;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.BaseRepository;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.TarjetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarjetaServiceImpl extends BaseServiceImpl<Tarjeta,Long> implements TarjetaService {
    @Autowired
    private TarjetaRepository tarjetaRepository;

    public TarjetaServiceImpl(BaseRepository<Tarjeta, Long> baseRepository, TarjetaRepository tarjetaRepository) {
        super(baseRepository);
        this.tarjetaRepository = tarjetaRepository;
    }
}
