package com.example.projetoescola;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.projetoescola.models.CategoriaCurso;
import com.example.projetoescola.models.Curso;
import com.example.projetoescola.repositors.CategoriaCursoRepository;
import com.example.projetoescola.repositors.CursoRepositer;

@SpringBootApplication
public class ProjetoescolaApplication /*~~(Could not parse as Java)~~>*/{

	@Bean
public CommandLineRunner init(
    @Autowired CursoRepositer cursoRepository,
    @Autowired CategoriaCursoRepository categoriaCursoRepository) {
    return args -> {
        //inserir curso
        CategoriaCurso c1 = categoriaCursoRepository.salvar(new CategoriaCurso (null, "Tecnologo")); 
     cursoRepository.salvar(
    new Curso(null, "teste",2000));
     cursoRepository.salvar(
    new Curso(null, "teste2", 2050));
List<Curso> listaCursos = cursoRepository.obterTodos();
listaCursos.forEach(System.out::println);
// Associar curso a categoria
listaCursos.forEach(curso -> {
    curso.setCategoriaCurso(c1);
    cursoRepository.salvar(curso);
});

};
} 
		public static void main(String[] args) {
		SpringApplication.run(ProjetoescolaApplication.class, args);
	}

}
