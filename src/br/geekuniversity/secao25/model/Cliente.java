package br.geekuniversity.secao26.model;

import br.geekuniversity.secao25.helper.Utils;

import java.util.Date;

/**
 * @Projeto_banco
 */
public class Cliente {
    private static int contador = 101;

    private int codigo;
    private String nome, email, cpf;
    private Date dataNascimento, dataCadastro;

    public Cliente(String nome, String email, String cpf, Date dataNascimento) {
        this.codigo = Cliente.contador;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = new Date();
        Cliente.contador++;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataCadastro(){
        return dataCadastro;
    }

    @Override
    public String toString() {
        return "Codigo: "+this.getCodigo()+
                "\nNome: "+this.getNome()+
                "\nEmail: "+this.getEmail()+
                "\nNascimento: "+ Utils.dateParaString(this.getDataNascimento())+
                "\nCadastro: "+Utils.dateParaString(this.getDataCadastro());
    }
}
