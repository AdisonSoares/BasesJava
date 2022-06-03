package br.geekuniversity.secao21;
import java.util.LinkedList;
import java.util.List;

/**
 * @Regras
 * Em uma pilha inserimos e removemos elementos do topo.
 *
 * @OBS_Java_tem_implementacao_de_pilha
 */
public class Pilha {
    private List<String> nomes = new LinkedList<String>();
    public void insere(String nome){
        this.nomes.add(nome);
    }

    public String remove(){
        try {
            return this.nomes.remove(nomes.size()-1);
        }catch (IndexOutOfBoundsException e){
            return "Lista vazia, nao eh possivel remover elementos!";
        }
    }

    public String mostraTopo(){

        return nomes.get(nomes.size() - 1);
    }

    public boolean vazia(){
        //Se for verdadeiro retorna true, se falso retorna false.
        return nomes.size()==0;
    }

    @Override
    public String toString() {
        return this.nomes.toString();
    }
}
