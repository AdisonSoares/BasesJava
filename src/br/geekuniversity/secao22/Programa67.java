package br.geekuniversity.secao22;

/**
 * @Default_methods
 */
public class Programa67 {
    public static void main(String[] args) {
        ITesteDefaultMethods teste = new TesteImplementacaoDefaultMethod();

        System.out.println(teste.mensagem());
        teste.meu_metodo();
    }
}
