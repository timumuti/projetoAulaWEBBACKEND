package com.example.projetoescola.repositors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.projetoescola.models.Curso;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository  // precisa por pra dar toda as caracteristicas de repositorio
public class CursoRepositer {
    @Autowired
     private EntityManager entityManager;

     @Transactional
     public Curso salvar(Curso curso ){
        curso = entityManager.merge(curso);
        return curso;
     }

     public List<Curso> obterTodos(){
        return entityManager.
        createQuery("from Curso", Curso.class).getResultList();
     }
}
