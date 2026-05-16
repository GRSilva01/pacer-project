package com.pacer.appPacer.entity.DTO;

public record UsuarioRequest(
        String nome,
        String email,
        String senha
) {
}
