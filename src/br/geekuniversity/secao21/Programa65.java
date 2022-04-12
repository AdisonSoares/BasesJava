package br.geekuniversity.secao21;

import java.util.HashSet;
import java.util.Set;

/**
 * @Implementacao_de_conjuntos_do_java
 *
 * @HashCode
 * Gera o indice de controle para nao repeticao, parecido com o laco alfabetico.
 */

public class Programa65 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();

        // Vazio
        System.out.println(nomes);

        //Preenchimento
        nomes.add("Alberto");
        nomes.add("Bruna");
        nomes.add("Felix");
        nomes.add("Geraldo");
        nomes.add("Gilson");

        //Preenchido
        System.out.println(nomes);

        //Exemplo
        String nome1 = "Alberto";
        String nome2 = "Bruna";
        String nome3 = "Felix";
        String nome4 = "Geraldo";
        String nome5 = "Gilson";

        //HashCode
        System.out.println(nome1.hashCode());
        System.out.println(nome2.hashCode());
        System.out.println(nome3.hashCode());
        System.out.println(nome4.hashCode());
        System.out.println(nome5.hashCode());
        System.out.println("Alberto".hashCode());

    }
}
