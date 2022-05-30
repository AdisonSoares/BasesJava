package br.geekuniversity.secao250.model;
import br.geekuniversity.secao250.helper.Utils;

/**
 * @Projeto_mercado
 */
public class Produto {
    static int contador = 1;
    private int codigo;
    private String nome;
    private Double preco;
    public Produto(String nome, Double preco) {
        this.codigo = Produto.contador;
        this.nome = nome;
        this.preco = preco;
        Produto.contador += 1;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Codigo: "+this.getCodigo()+
                "\nNome: "+this.getNome()+
                "\nPreco: "+Utils.doubleParaString(this.getPreco())+"\n";
    }
}
