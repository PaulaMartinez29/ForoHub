package com.alura.ForoHub.Alura.DTO;


import com.alura.forohub.model.Topico;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroRespuestas(
        @NotBlank
        String mensaje,
        @NotNull
        Long autorId,
        @NotNull
        Long topicoId) {

    public static record DatosActualizarRespuestas(
            @NotNull
            Long id,
            String mensaje,
            Boolean solucion,
            Topico topico) {

    }
}