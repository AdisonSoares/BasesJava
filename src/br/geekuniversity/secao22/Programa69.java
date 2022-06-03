package br.geekuniversity.secao22;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Classes_anonimas
 * Utaliza-se quando temos interfaces com um ou poucos metodos e nao
 * precisamos reaproveitar o codigo da classe, ou seja, se nao iremos
 * reaproveitar a classe em um outro lugar, servindo apenas para implementar
 * uma interface com um ou poucos metodos, podemos utilizar o conceito
 * de classe anonima.
 * Nesse exemplo a interface imprimeNaLinha eh totalmente otimizada,
 * sendo substituida na implementacao direta dentro do programa,
 * no metodo Consumer, sendo que o new nao nominaliza o Consumer,
 * por isso ela eh anonima.
 */
public class Programa69 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        Comparator<String> comparador = new ComparadorPorTamanho();


        palavras.add("Amanda");
        palavras.add("Silva");
        palavras.add("Carlos");
        palavras.add("Mauricio");
        palavras.add("Vanilson");

        palavras.sort(comparador);

        Consumer<String> consumidor = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        palavras.forEach(consumidor);
    }
}
