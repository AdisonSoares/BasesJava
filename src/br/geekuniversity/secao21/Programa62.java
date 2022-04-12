package br.geekuniversity.secao21;

/**
 * @Filas
 * Sao estruturas de dados em que o elemento disponivel sempre estara na primeira posicao,
 * quando acrescentar ou tirar algum elemento sempre sera de baixo para o topo,
 * primeiro elemento que entra eh o primeiro que sai.
 * Cada novo elemento entra no final da fila.
 *
 * @OBS_Ao_remover_elementos_sempre_vai_ser_no_indice_zero
 */
public class Programa62 {
    public static void main(String[] args) {
        Fila fila = new Fila();

        //Exibindo fila
        System.out.println("Elementos incluidos: "+fila);

        //Teste para verificar se esta vazia
        System.out.println("Fila esta vazia? "+fila.vazia());

        //Adicionando elementos
        fila.adiciona("Rafael");

        //Exibindo fila
        System.out.println("Elementos incluidos: "+fila);

        //Teste para verificar se esta vazia
        System.out.println("Fila esta vazia? "+fila.vazia());

        //Adicionando elementos
        fila.adiciona("Angela");

        //Exibindo fila
        System.out.println("Elementos incluidos: "+fila);

        //Teste para verificar se esta vazia
        System.out.println("Fila esta vazia? "+fila.vazia());

        //Adicionando elementos
        fila.adiciona("Amelia");

        //Exibindo fila
        System.out.println("Elementos incluidos: "+fila);

        //Teste para verificar se esta vazia
        System.out.println("Fila esta vazia? "+fila.vazia());

        //Removendo elementos
        String ret1 = fila.remove();
        System.out.println("Elemento removido: "+ret1);

        //Exibindo fila
        System.out.println("Elementos incluidos: "+fila);

        //Teste para verificar se esta vazia
        System.out.println("Fila esta vazia? "+fila.vazia());

        //Removendo elementos
        String ret2 = fila.remove();
        System.out.println("Elemento removido: "+ret2);

    }
}
