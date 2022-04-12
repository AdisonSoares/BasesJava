package br.geekuniversity.secao22;

import java.util.function.Consumer;

/**
 * @Nao_serve
 * Depois de implementar no programa 69 a mesma funcao anonima
 * essa classe nao tem serventia.
 */
public class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
