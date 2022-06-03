package br.geekuniversity.secao21;

/**
 * @Pilhas
 * Sao estruturas de dados em que o elemento disponivel sempre estara no topo,
 * quando acrescentar ou tirar algum elemento sempre sera do topo para baixo,
 * o último elemento que entra eh o primeiro que sai.
 */
public class Programa60 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        //Exibe status da pilha
        System.out.println(pilha);
        System.out.println("Pilha vazia? = "+pilha.vazia()+"\n");

        //Inclusao de elementos
        pilha.insere("Mario");
        pilha.insere("Luis");
        System.out.println("Incluido: "+pilha);

        //Verifica se a pilha esta vazia
        System.out.println("Pilha vazia? = "+pilha.vazia());

        //Mostra o topo
        String ret1 = pilha.mostraTopo();
        System.out.println("Topo da pilha: "+ret1);

        //Remove e mostra o que foi removido
        String r1 = pilha.remove();
        System.out.println("Removido: "+r1+"\n");

        //Exibicao depois da remocao
        System.out.println("Incluido: "+pilha);

        //Verifica se a pilha esta vazia
        System.out.println("Pilha vazia? = "+pilha.vazia());

        //Mostra o topo
        String ret2 = pilha.mostraTopo();
        System.out.println("Topo da pilha: "+ret2);

        //Remove e mostra o que foi removido
        String r2 = pilha.remove();
        System.out.println("Removido: "+r2+"\n");

        //Exibe status da pilha
        System.out.println(pilha);
        System.out.println("Pilha vazia? = "+pilha.vazia()+"\n");

        //Remove e mostra o que foi removido
        String r3 = pilha.remove();
        System.out.println("Removido: "+r3+"\n");
    }
}
