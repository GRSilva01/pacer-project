package com.pacer.appPacer.service;

import com.pacer.appPacer.entity.DTO.UsuarioRequest;
import com.pacer.appPacer.entity.Usuario;
import com.pacer.appPacer.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void cadastrarUsuario(Usuario usuario) {
        if (usuarioRepository.existsByEmail(usuario.getEmail())) {
            throw new IllegalArgumentException("Email já cadastrado");
        }
        usuarioRepository.save(usuario);
    }
}