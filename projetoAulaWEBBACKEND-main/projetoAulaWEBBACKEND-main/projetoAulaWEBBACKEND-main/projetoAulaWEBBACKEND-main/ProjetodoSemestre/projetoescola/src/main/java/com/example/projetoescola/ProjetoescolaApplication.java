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
public class ProjetoescolaApplication /*~~(Could not parse as Java) ~~>*/{

	@Bean
public CommandLineRunner init(
    @Autowired CursoRepositer cursoRepository,
    @Autowired CategoriaCursoRepository categoriaCursoRepository) {
    return args -> {
        //inserir curso
        CategoriaCurso c1 = categoriaCursoRepository.salvar(new CategoriaCurso (null, "Tecnologo")); 
     cursoRepository.save(
    new Curso(null, "Jogos Digitais",2000, null));
     cursoRepository.save(
    new Curso(null, "Analise", 2050, null));
List<Curso> listaCursos = cursoRepository.findAll();
listaCursos.forEach(System.out::println);
// Associar curso a categoria
listaCursos.forEach(curso -> {
    curso.setCategoriaCurso(c1);
    cursoRepository.save(curso);
});

System.out.println( "Curso que começa com 'Jogos'");
cursoRepository.findByNomeLike("Jogos%").forEach(system.out::println);

};
} 
		public static void main(String[] args) {
		SpringApplication.run(ProjetoescolaApplication.class, args);
	}

}
