package com.example.projetoescola.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Data    // coloca todas os constructor e gets e sets
@NoArgsConstructor  //cria o construtor vazio
@AllArgsConstructor // cria construtores com 3 argmentos
@Builder  // ajuda para não dar sobrecarga nos atributos
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
    private String nome;
    private Double salario;
}