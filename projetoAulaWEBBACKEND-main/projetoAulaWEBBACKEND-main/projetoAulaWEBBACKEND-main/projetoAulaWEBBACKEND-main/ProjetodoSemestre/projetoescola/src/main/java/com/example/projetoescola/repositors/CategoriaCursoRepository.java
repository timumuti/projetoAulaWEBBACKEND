package com.example.projetoescola.repositors;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.projetoescola.models.CategoriaCurso;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

public interface CategoriaCursoRepository extends JpaCursoRepository <CategoriaCurso, Integer> {

    
} 



/*~~(Could not parse as Java)
@Repository
public class CategoriaCursoRepository {
    @Autowired // esse ele vai fazer a injeção de dependecia
    private EntityManager entityManager;
    @Transactional
    public CategoriaCurso salvar(CategoriaCurso categoriaCurso) {
        categoriaCurso = entityManager.merge(categoriaCurso);
        return categoriaCurso;
    }
    public List<CategoriaCurso> listartodos(){
        String jpql = "SELECT c FROM C";
        return entityManager.createQuery(jpql, CategoriaCurso.class).getResultList();
    }/*~~(Could not parse as Java) ~~>*/

