package br.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Default_methods
 * São metodos concretos implementados em interfaces. Estes metodos, como sao
 * concretos, ou seja, ja possuem implementacao, nao precisam ser implementadas
 * nas classes que as implementam por heranca, seu uso eh a partir da versao 8.
 * Pode-se ter constantes e metodos abstratos e default methods ja implementados
 * em interfaces que nao obriga a serem implementados.
 *
 * @Collections.sort
 * Organiza em ordem alfabetica.
 */
public class Programa66 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        Comparator<String> comparador = new ComparadorPorTamanho();

        palavras.add("Amanda");
        palavras.add("Silva");
        palavras.add("Carlos");
        palavras.add("Mauricio");
        palavras.add("Vanilson");

        //Collections.sort(palavras, comparador);

        palavras.sort(comparador);

        System.out.println(palavras);
    }
}
