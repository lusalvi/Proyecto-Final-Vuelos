package com.example.Proyecto_Final_Vuelo_Salvi.services;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.Aerolinea;
import com.example.Proyecto_Final_Vuelo_Salvi.entities.Usuario;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.BaseRepository;
import com.example.Proyecto_Final_Vuelo_Salvi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Long> implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository, UsuarioRepository usuarioRepository) {
        super(baseRepository);
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> search(String filtro) throws Exception {
        try {
            List<Usuario> usuarios = usuarioRepository.findByNombreContaining(filtro);
            return usuarios;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Usuario> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Usuario> usuarios = usuarioRepository.findByNombreContaining(filtro, pageable);
            return usuarios;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
