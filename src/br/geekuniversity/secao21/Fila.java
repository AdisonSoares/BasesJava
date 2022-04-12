package br.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

public class Fila {
    private List<String> nomes = new LinkedList<String>();

    @Override
    public String toString() {
        return this.nomes.toString();
    }

    public void adiciona(String nome) {
        this.nomes.add(nome);
    }

    public String remove() {
        try {
            return nomes.remove(0);
        }catch (IndexOutOfBoundsException e){
            return "Lista vazia!";
        }
    }

    public boolean vazia() {
        return this.nomes.size() == 0;
    }
}
