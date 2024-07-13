package com.alura.ForoHub.Alura.repository;

import com.alura.forohub.model.Curso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long>{

    public Page<Curso> findByStatusTrue(Pageable paginacion);

}
