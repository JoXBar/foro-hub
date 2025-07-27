package com.alura.Foro_Hub.domain.respuesta;

import com.alura.Foro_Hub.domain.topicos.DatosListaTopicos;
import jakarta.validation.constraints.NotNull;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class DatoslistaRespuestasModelAssembler implements RepresentationModelAssembler<DatosListaRespuestas, EntityModel<DatosListaRespuestas>> {
    @Override
    @NotNull
    public EntityModel<DatosListaRespuestas> toModel(@NotNull DatosListaRespuestas datos) {
        return EntityModel.of(datos);
    }}


