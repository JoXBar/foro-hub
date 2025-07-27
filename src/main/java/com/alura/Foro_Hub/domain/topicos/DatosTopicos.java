package com.alura.Foro_Hub.domain.topicos;
import com.alura.Foro_Hub.domain.cursos.Curso;
import com.alura.Foro_Hub.domain.perfiles.DatosPerfil;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosTopicos(
        @NotNull
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @Valid
        DatosPerfil autor,
        @NotNull
        Curso curso

) {
}
