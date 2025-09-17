package com.example.projetoescola.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity  // vai transformar numa tabela para banco de dados
@Data    // coloca todas os constructor e gets e sets
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {
    @Id  //primaryKey 
    @GeneratedValue (strategy = GenerationType.IDENTITY)  // vai transforma minha chave primaria em auto incrementativo
    private Long id;
    @Column(length = 200, nullable = false)  // para limitar a 200 caracteres o nome e tambem não aceitar nulos
    private String nome;
    @Column(nullable = false)      // carga horaria não pode ser nula, @COLUMN não é obrigatorio, mas se quiser colocar --
    private Integer cargaHoraria;   //consições nas colunas, precisa por
   
    @ManyToOne
    @JoinColumn(name = "categoriaCurso_id")
    @ToString.Exclude
    private CategoriaCurso categoriaCurso;

/*~~(Could not parse as Java)        // get e settes antigos
    public Curso(Long id, String nome, Integer cargaHoraria) { // com os parametros
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    public Curso() {   // vazio
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override     // esse é o "toString" é o q vai mudar a forma que vai ser imressa a informação
    public String toString() {
        return "Curso [id=" + id + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + "]";
    }
    public CategoriaCurso getCategoriaCurso() {
        return categoriaCurso;
    }
    public void setCategoriaCurso(CategoriaCurso categoriaCurso) {
        this.categoriaCurso = categoriaCurso;
    }
     ~~>*/
}
