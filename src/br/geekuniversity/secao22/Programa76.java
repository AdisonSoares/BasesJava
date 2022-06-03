package br.geekuniversity.secao22;
import java.util.ArrayList;
import java.util.List;

/**
 * @Streams
 * Sao fluxos/entradas de dados/objetos utilizados para que possamos
 * trabalhar com esses dados de forma mais criteriosa, ajuda a
 * simplificar filtros de pesquisa.
 * Quando trabalhamos com stream, os metodos aplicados a este stream
 * nao afeta a colecao original, retornando um dado do tipo stream.
 */
public class Programa76 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        //Classes anonimas
        cursos.add(new Curso("Programacao do basico ao avancado", 170));
        cursos.add(new Curso("Programacao em Java", 198));
        cursos.add(new Curso("Programacao Web", 150));
        cursos.add(new Curso("Git e github", 147));
        cursos.add(new Curso("Padroes de designer", 76));
        cursos.add(new Curso("Banco de dados completo", 87));

        //Exibir os cursos com mais de 100 alunos

        //Lambda
        cursos.stream().//Transforma a colecao em stream - Streams
                filter(c -> c.getAluno() >= 100).//Aplicacao do filtro - Lambda
                forEach(c -> System.out.println(c.getNome()));//Mostrar resultado - Lambda

        //Lambda e Method Reference
        cursos.stream().//Transforma a colecao em stream - Streams
                filter(c -> c.getAluno() >= 100).//Aplicacao do filtro - Lambda
                forEach(System.out::println);//Mostrar resultado - Method Reference
    }
}
