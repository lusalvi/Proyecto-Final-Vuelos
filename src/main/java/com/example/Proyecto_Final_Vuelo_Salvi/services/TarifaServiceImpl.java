package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Tarifa;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.BaseRepository;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.TarifaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarifaServiceImpl extends BaseServiceImpl<Tarifa,Long> implements TarifaService {
    @Autowired
    private TarifaRepository tarifaRepository;

    public TarifaServiceImpl(BaseRepository<Tarifa, Long> baseRepository, TarifaRepository tarifaRepository) {
        super(baseRepository);
        this.tarifaRepository = tarifaRepository;
    }
}
