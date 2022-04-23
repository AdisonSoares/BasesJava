package br.geekuniversity.secao25.model;

import br.geekuniversity.secao25.helper.Utils;

/**
 * @Projeto_mercado
 */
public class Produto {
    private static int contador = 1;

    private int codigo;
    private String nome;
    private Double preco;

    public int getCodigo(){ return this.codigo; }

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

    public Produto(String nome, Double preco) {
        this.codigo = Produto.contador;
        this.nome = nome;
        this.preco = preco;
        Produto.contador++;
    }

    @Override
    public String toString() {
        return "Codigo: "+this.getCodigo()+
                "\nNome: "+this.getNome()+
                "\nPreco: "+Utils.doubleParaString(this.getPreco())+"\n";
    }
}
