package br.geekuniversity.secao25.view;
import br.geekuniversity.secao25.helper.Utils;
import br.geekuniversity.secao25.model.Cliente;
import br.geekuniversity.secao25.model.Conta;

/**
 * @Projeto_banco
 */
public class Teste {
    public static void main(String[] args) {
        Cliente bruno = new Cliente(
                "Bruno Silva",
                "brun38@gmail.com",
                "123.456.963.41",
                Utils.stringParaData("18/02/1984"));


        Cliente veronica = new Cliente(
                "Veronica Rocha",
                "vera8@gmail.com",
                "147.258.369.74",
                Utils.stringParaData("12/07/1996"));

        //Criacao
        Conta conta101 = new Conta(bruno);
        Conta conta102 = new Conta(veronica);

        //Deposito
        conta101.depositar(500.00);
        conta102.depositar(500.00);

        //Exibir
        System.out.println(conta101+"\n");
        System.out.println(conta102+"\n");

        //Saque
        conta101.sacar(300.00);

        //Exibir
        System.out.println(conta101+"\n");
        System.out.println(conta102+"\n");

        //Limite
        conta101.setLimite(200.00);

        //Exibir
        System.out.println(conta101+"\n");
        System.out.println(conta102+"\n");

        //Transferencia
        conta102.transferir(conta101, 50.0);

        //Exibir
        System.out.println(conta101+"\n");
        System.out.println(conta102+"\n");
    }
}
