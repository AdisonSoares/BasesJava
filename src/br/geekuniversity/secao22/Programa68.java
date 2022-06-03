package br.geekuniversity.secao22;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @ForEach
 */
public class Programa68 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        Consumer<String> consumidor = new ImprimeNaLinha();
        
        palavras.add("Amanda");
        palavras.add("Silva");
        palavras.add("Carlos");
        palavras.add("Mauricio");
        palavras.add("Vanilson");

        System.out.println(palavras);

        for (int i = 0; i < palavras.size(); i++) {
            System.out.println(palavras.get(i));
        }

        System.out.println("\n");

        for (String p : palavras) {
            System.out.println(p);
        }

        System.out.println("\n");

        palavras.forEach(consumidor);
    }
}
