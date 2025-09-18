package main.java.com.example.projetoescola.repositors;

public interface ProfessorRepository extends JpaRepository<Professor, Long > {
List<Professor> findByGreaterThanEqual(Double salario);
List<professor> findByLowerThanEqual(Double salario);
List<Professor> findByNomeLike(String nome);

                          }