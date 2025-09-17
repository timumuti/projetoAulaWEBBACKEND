package com.example.projetoescola.repositors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.projetoescola.models.Curso;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


public interface CursoRepositer 
extends JpaRepository<Curso // entidade que vai gerenciar
                          , Long > {// valor da chave primaria
   
   List<Curso> findByNomeLike(String nome);
   List<Curso> findByCargaHorariaGeatterThanEqual(Integer cargaHoraria);
   List<Curso> finfByNomeAndCargaHorariaGeatterThanEqual(String nome, Integer cargaHoraria);

@Query ("select c from Curso c where c.categoriaCurso.id = :idCategoria")
   List<Curso> findByIdCategoria(Integer idCategoria);
}






/*~~(Could not parse as Java)
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

    (Could not parse as Java) ~~>*/

