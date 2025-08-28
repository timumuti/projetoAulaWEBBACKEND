package com.example.projetoescola;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.projetoescola.models.Curso;
import com.example.projetoescola.repositors.CursoRepositer;

@SpringBootApplication
public class ProjetoescolaApplication {

	@Bean
public CommandLineRunner init(@Autowired CursoRepositer cursoRepository) {
    return args -> {
     cursoRepository.salvar(
    new Curso(null, "teste",2000));
     cursoRepository.salvar(
    new Curso(null, "teste2", 2050));
List<Curso> listaCursos = cursoRepository.obterTodos();
listaCursos.forEach(System.out::println);
};
} 

		public static void main(String[] args) {
		SpringApplication.run(ProjetoescolaApplication.class, args);
	}

}
