package com.alura.ForoHub.Alura.Service;

import com.alura.forohub.DTO.DatosRegistroCurso;
import com.alura.forohub.model.Curso;
import com.alura.forohub.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    private ICursoRepository cursoRepo;

    public Curso registrarCurso(DatosRegistroCurso datosRegistroCurso){
        Curso curso = new Curso(datosRegistroCurso);

        return cursoRepo.save(curso);
    }
}
