package br.geekuniversity.secao22;
import java.util.Comparator;

/**
 * @Classe_propria_para_comparar
 * Essa classe implementa o comparator, que serve para comparar apenas Strings.
 *
 * @Resultados
 * String 01 < String 02, retorna -1
 * String 01 > String 02, retorna  1
 * String 01 = String 02, retorna  0
 *
 */
public class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
            return -1;
        }
        if (o1.length() > o2.length()) {
            return 1;
        }
        return 0;
    }
}
