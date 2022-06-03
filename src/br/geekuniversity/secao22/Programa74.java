package br.geekuniversity.secao22;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @Method_references
 * Sao simplificacoes de lambdas
 */
public class Programa74 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Amanda");
        palavras.add("Silva");
        palavras.add("Carlos");
        palavras.add("Mauricio");
        palavras.add("Vanilson");

        //Sem references
        palavras.sort(Comparator.comparing(s -> s.length()));

        //Com references - forma 01
        palavras.sort(Comparator.comparing(String::length));

        //Com references - forma 02
        //Function<String, Integer> tamanho = String::length; - Method references
        Function<String, Integer> tamanho = s -> s.length();//Lambda
        Comparator<String> comparador = Comparator.comparing(tamanho);
        palavras.sort(comparador);

        //System.out.println(palavras);

        palavras.forEach(System.out::println);//Method references
    }
}
