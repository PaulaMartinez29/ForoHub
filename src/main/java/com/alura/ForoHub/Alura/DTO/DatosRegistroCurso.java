package com.alura.ForoHub.Alura.DTO;

import com.alura.forohub.enumerador.Categoria;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroCurso(

        @NotBlank(message = "El nombre es obligatorio") String nombre,
        Categoria categoriaPrincipal,
        String subcategoria
) {
}
