package com.example.projetoescola.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Data    // coloca todas os constructor e gets e sets
@NoArgsConstructor  //cria o construtor vazio
@AllArgsConstructor // cria construtores com 3 argmentos
@Builder  // ajuda para não dar sobrecarga nos atributos
public class CategoriaCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
    private String nome;
 
    @OneToMany(mappedBy = "categoriaCurso",
                   Fetch = FetchType.EAGER)
    private List<Curso> cursos;


/*~~(Could not parse as Java) 
    public CategoriaCurso(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public CategoriaCurso() {
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    (Could not parse as Java) ~~>*/
}


