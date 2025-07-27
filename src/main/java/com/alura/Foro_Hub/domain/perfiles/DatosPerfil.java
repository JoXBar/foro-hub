package com.alura.Foro_Hub.domain.perfiles;

import jakarta.validation.constraints.NotBlank;

public record DatosPerfil(
        Long id,

        String nombre
) {
}
