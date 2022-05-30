package br.geekuniversity.secao25.view;
import br.geekuniversity.secao25.model.Produto;

/**
 * @Projeto_mercado
 */
public class Teste {
    public static void main(String[] args) {
        Produto pcDell = new Produto("Dell Inspiron", 3049.00);
        Produto pcIntel = new Produto("Intel Core I5", 1310.00);
        Produto pcIntel2 = new Produto("Intel Core I7", 2310.00);

        System.out.println(pcDell);
        System.out.println(pcIntel);
        System.out.println(pcIntel2);
    }
}
