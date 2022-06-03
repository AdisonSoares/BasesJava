package br.geekuniversity.secao22;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Lambdas
 * Sao reconhecidas pela flecha, sao funcoes anonimas.
 */
public class Programa71 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        Comparator<String> comparador = new ComparadorPorTamanho();

        palavras.add("Amanda");
        palavras.add("Silva");
        palavras.add("Carlos");
        palavras.add("Mauricio");
        palavras.add("Vanilson");

        palavras.sort(comparador);

        //Forma 01
        palavras.forEach((String s) -> {
            System.out.println(s);
        });

        System.out.println("\n");

        //Forma 02
        palavras.forEach(s -> System.out.println(s));
    }
}
