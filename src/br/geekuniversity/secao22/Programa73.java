package br.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Lambdas
 * Sao reconhecidas pela flecha, sao funcoes anonimas.
 * Podem ser utilizadas com interfaces funcionais, por exemplo
 * com a interface consumer.
 * A lambda deve ser compativel com a funcao da inteface utilizada.
 * Como exemplo a interface consumer possui um metodo que recebe uma string
 * e nao tem retorno. Por isso foi possivel utilizar a expressao lambda que
 * passa uma string como parametro e nao tem retorno.
 */
public class Programa73 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Amanda");
        palavras.add("Silva");
        palavras.add("Carlos");
        palavras.add("Mauricio");
        palavras.add("Vanilson");

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        //Forma 01
        palavras.forEach(s -> System.out.println(s));

        //Forma 02
        Consumer<String> consumer = s -> System.out.println(s);
        palavras.forEach(consumer);

    }
}
