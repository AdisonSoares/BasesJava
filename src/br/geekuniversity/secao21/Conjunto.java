package br.geekuniversity.secao21;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @LinkedList_de_LinkedList_de_String
 * O laco vai criar uma LinkedList em ordem alfabetica, 26 letras totais do alfabeto,
 * e vai guardar cada palavra dentro de sua respectiva letra inicial para nao precisar
 * consultar palavra por palavra para controlar as repeticoes.
 */

public class Conjunto {
    //private LinkedList<LinkedList<String>> tabela = new LinkedList<LinkedList<String>>(); - ArrayLista eh melhoria + performance
    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

    public Conjunto() {
        for (int i = 0; i < 26; i++) {
            tabela.add(new LinkedList<String>());
        }
    }

    private int calculaIndice(String nome){
        return nome.toLowerCase().charAt(0) % 26;
    }

    public void adiciona(String nome){
        if (!contem(nome)) {
            int indice = calculaIndice(nome);
            List<String> lista = tabela.get(indice);
            lista.add(nome);
        }else{
            System.out.println("Nome ja existe na lista, nao pode ser incluido!");
        }
    }

    public void remove(String nome){
        if (contem(nome)) {
            int indice = calculaIndice(nome);
            List<String> lista = tabela.get(indice);
            lista.remove(nome);
        }
    }

    private boolean contem(String nome){
        int indice = calculaIndice(nome);
        return tabela.get(indice).contains(nome);
    }

    @Override
    public String toString() {
        return tabela.toString();
    }
}
