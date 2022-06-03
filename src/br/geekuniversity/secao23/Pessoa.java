package br.geekuniversity.secao23;

/**
 * @Debugando
 * Debugar tem relação com a investigacao para encontrar bugs ou
 * verificar o comportamento do sistema para saber se estao se comportando
 * conforme o esperado.
 */
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void falar(String msg){
        System.out.println(this.getNome()+" disse "+msg);
    }
}
