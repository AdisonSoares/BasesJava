package br.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

/**
 * @Lambdas
 * Sao reconhecidas pela flecha, sao funcoes anonimas.
 */
public class Programa72 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Amanda");
        palavras.add("Silva");
        palavras.add("Carlos");
        palavras.add("Mauricio");
        palavras.add("Vanilson");

        //Forma 01
        palavras.sort((s1, s2) ->{
            if (s1.length() < s2.length()) {
                return -1;
            }
            if (s1.length() > s2.length()) {
                return 1;
            }
            return 0;
        });

        //Forma 02
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.forEach(s -> System.out.println(s));

    }
}
