package br.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Implementacao_de_fila_pelo_java
 */
public class Programa63 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Exibindo fila
        System.out.println("Elementos incluidos: "+fila);

        //Adicionando elementos
        fila.add("Rafael");
        fila.add("Angela");

        //Exibindo fila
        System.out.println("Elementos incluidos: "+fila);

        //Removendo elementos
        String ret1 = fila.poll();
        System.out.println("Elemento removido: "+ret1);

        //Exibindo fila
        System.out.println("Elementos incluidos: "+fila);



    }
}