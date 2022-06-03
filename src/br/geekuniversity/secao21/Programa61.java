package br.geekuniversity.secao21;
import java.util.Stack;

/**
 * @Implementacao_de_pilhas_pelo_java
 */
public class Programa61 {
    public static void main(String[] args) {
        Stack<String> nomes = new Stack<String>();

        System.out.println(nomes);

        //Adicionando
        nomes.push("Mario");
        nomes.push("Luis");
        System.out.println(nomes);

        //Retorna o topo
        String ret1 = nomes.peek();
        System.out.println("Elemento do topo: "+ret1);
        System.out.println(nomes);

        //Removendo
        String r1 = nomes.pop();
        System.out.println("Removido: "+r1);
        System.out.println(nomes);

        //Retorna o topo
        String ret2 = nomes.peek();
        System.out.println("Elemento do topo: "+ret2);
        System.out.println(nomes);

        //Removendo
        String r2 = nomes.pop();
        System.out.println("Removido: "+r2);
        System.out.println(nomes);
    }
}
