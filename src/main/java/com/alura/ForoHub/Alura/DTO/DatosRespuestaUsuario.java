package com.alura.ForoHub.Alura.DTO;

import com.alura.forohub.enumerador.TipoPerfil;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRespuestaUsuario(
        @NotBlank
        String nombre,
        @NotBlank
        String email,
        @NotNull
        TipoPerfil perfil) {

}
