package com.pacer.appPacer.controller;

import com.pacer.appPacer.service.UsuarioService;
import com.pacer.appPacer.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody Usuario usuario) {
        usuarioService.cadastrarUsuario(usuario);
    }
}

@PostMapping("/cadastrar")
public void cadastrar(@RequestBody Usuario usuario) {
    usuarioService.cadastrarUsuario(usuario);
}

@PutMapping("/alterar/{id}")
public Usuario alterarCredenciais(
        @PathVariable Long id,
        @RequestBody Usuario usuarioAtualizado) {

    return usuarioService.alterarCredenciais(id, usuarioAtualizado);
}