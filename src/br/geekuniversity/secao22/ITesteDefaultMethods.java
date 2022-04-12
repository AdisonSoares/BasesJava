package br.geekuniversity.secao22;

/**
 * @Interface
 * Nao pode ter metodos implementados mas pode ter metodos default implementados.
 */
public interface ITesteDefaultMethods {
    int valor = 9;

    public String mensagem();

    default void meu_metodo(){
        System.out.println("Meu default method!");
    }
}
