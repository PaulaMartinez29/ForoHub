package com.alura.ForoHub.Alura.DTO;

import com.alura.forohub.enumerador.TipoPerfil;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroUsuario(
        @NotBlank String nombre,
        @NotBlank String email,
        @NotBlank String password,
        @NotNull TipoPerfil perfil
) {

    public static record DatosActualizarUsuario(
            @NotNull Long id,
            String nombre,
            String email,
            TipoPerfil perfil
    ){

    }
}
