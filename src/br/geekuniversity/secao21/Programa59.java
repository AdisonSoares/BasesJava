package br.geekuniversity.secao21;

/**
 * @Listas_duplamente_ligadas
 * Essa lista aponta para a proxima posicao e também
 * para a posição anterior
 */
public class Programa59 {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        System.out.println(lista);
        lista.adicionaNoComeco("Angelica");
        System.out.println(lista);
        lista.adicionaNoComeco("Alex");
        System.out.println(lista);
        lista.removeDoFim();
        System.out.println(lista);
        lista.removeDoFim();
        System.out.println(lista);
        lista.adicionaNoComeco("Angelica");
        lista.adicionaNoComeco("Alex");
        System.out.println(lista);
        lista.removeQualquerPosicao(0);
        System.out.println(lista);
        System.out.println(lista.contem("Angelica"));
        System.out.println(lista.contem("Alex"));
    }
}
