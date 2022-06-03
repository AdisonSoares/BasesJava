package br.geekuniversity.secao22;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Revisao
 */
public class Programa75 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        //Classes anonimas
        cursos.add(new Curso("Programacao do basico ao avancado", 170));
        cursos.add(new Curso("Programacao em Java", 198));
        cursos.add(new Curso("Programacao Web", 150));
        cursos.add(new Curso("Git e github", 147));
        cursos.add(new Curso("Padroes de designer", 121));
        cursos.add(new Curso("Banco de dados completo", 113));

        cursos.sort(Comparator.comparing(c -> c.getAluno()));//Lambda
        cursos.sort(Comparator.comparing(Curso::getAluno));//Method References

        cursos.forEach(c -> System.out.println(c.getNome()));//Lambda
        cursos.forEach(System.out::println);//Method References
    }
}
