package com.alura.ForoHub.Alura.DTO;


import com.alura.forohub.enumerador.Categoria;
import com.alura.forohub.model.Curso;

public record DatosListadoCurso(
        String nombre,
        Categoria categoriaPrincipal,
        String subcategoria) {

    public DatosListadoCurso(Curso curso) {
        this(
                curso.getNombre(),
                curso.getCategoriaPrincipal(),
                curso.getSubcategoria()
        );
    }
}