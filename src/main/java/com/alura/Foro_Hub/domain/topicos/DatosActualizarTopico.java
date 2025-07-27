package com.alura.Foro_Hub.domain.topicos;

import com.alura.Foro_Hub.domain.cursos.Curso;
import com.alura.Foro_Hub.domain.perfiles.DatosPerfil;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull Long id,
        String titulo,
        String mensaje,
        Curso curso,
        DatosPerfil autor


) {


}
