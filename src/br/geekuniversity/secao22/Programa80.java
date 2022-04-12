package br.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Streams
 *  * Sao fluxos/entradas de dados/objetos utilizados para que possamos
 * trabalhar com esses dados de forma mais criteriosa, ajuda a
 * simplificar filtros de pesquisa.
 * Quando trabalhamos com stream, os metodos aplicados a este stream
 * nao afeta a colecao original, retornando um dado do tipo stream.
 */
public class Programa80 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        //Classes anonimas
        cursos.add(new Curso("Programacao do basico ao avancado", 170));
        cursos.add(new Curso("Programacao em Java", 198));
        cursos.add(new Curso("Programacao Web", 150));
        cursos.add(new Curso("Git e github", 147));
        cursos.add(new Curso("Padroes de designer", 76));
        cursos.add(new Curso("Banco de dados completo", 87));

        //Guardar os dados em uma nova lista de acordo com o filtro
        List<Curso> resultado = cursos.stream()
                .filter(c -> c.getAluno() >= 100)
                .collect(Collectors.toList());

        System.out.println(resultado);//Forma 01
        resultado.forEach(System.out::println);//Forma 02

        //Forma mais complexa
        cursos.stream()
                .filter(c -> c.getAluno() >=100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAluno()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
    }
}
