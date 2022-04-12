package br.geekuniversity.secao21;

/**
 * @Lista_ligada Também conhecida como LinkedList, sua diferanca para um vetor,
 * no vetor cada posicacao esta um do lado do outro em sequencia,
 * na lista ligada as posicoes dos vetores podem estar em locais diferentes,
 * porem um aponta para o outro indicando o proximo elemento.
 */
public class Programa57 {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println("Lista vazia");
        System.out.println(lista+"\n");

        System.out.println("Lista adicionada no fim");
        lista.adicionaNoFim("Gilvan");
        System.out.println(lista);
        lista.adicionaNoFim("Renata");
        System.out.println(lista);
        lista.adicionaNoFim(478);
        System.out.println(lista+"\n");


        System.out.println("Lista adicinada no comeco");
        lista.adicionaNoComeco("Maria");
        System.out.println(lista);
        lista.adicionaNoComeco("Mariza");
        System.out.println(lista);
        lista.adicionaNoComeco(478);
        System.out.println(lista+"\n");

        System.out.println("Lista adicinada no meio, escolhe a posicao");
        lista.adicionaNoMeio(2, "Fernando");
        System.out.println(lista);
        lista.adicionaNoMeio(4, "Julia");
        System.out.println(lista);
        lista.adicionaNoMeio(7, "Cleiton");
        System.out.println(lista+"\n");

        System.out.println("Utilizando os outros metodos\n");

        System.out.println("Metodo pega");
        Object ret = lista.pega(2);
        System.out.println(ret+"\n");

        System.out.println("Metodo tamanho");
        System.out.println(lista.tamanho()+"\n");

        System.out.println("Remove do comeco");
        lista.removeDoComeco();
        System.out.println(lista+"\n");
    }
}
