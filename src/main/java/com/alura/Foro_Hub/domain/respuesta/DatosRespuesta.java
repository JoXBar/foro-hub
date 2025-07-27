package com.alura.Foro_Hub.domain.respuesta;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
public record DatosRespuesta(
            @NotNull
            Long id,
            @NotBlank
            String mensaje,
            @NotNull
            Long autorId,
            @NotNull
            Long topicoId
) {
}
