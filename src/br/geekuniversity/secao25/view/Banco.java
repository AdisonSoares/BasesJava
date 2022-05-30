package br.geekuniversity.secao25.view;

import br.geekuniversity.secao25.helper.Utils;
import br.geekuniversity.secao25.model.Cliente;
import br.geekuniversity.secao25.model.Conta;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Projeto_banco
 */
public class Banco {
    static String nome = "Digi Bank";
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Conta> contas;

    public static void main(String[] args) {
        Banco.contas = new ArrayList<Conta>();
        Banco.menu();
    }
    public static void menu(){
        int opcao = 0;
        System.out.println("==============================");
        System.out.println("=========== ATM ==============");
        System.out.println("========="+Banco.nome+"============");
        System.out.println("==============================\n");
        System.out.println("Escolha uma opcao do menu:");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Efetuar saque");
        System.out.println("3 - Efetuar deposito");
        System.out.println("4 - Efetuar transferencia");
        System.out.println("5 - Listar contas");
        System.out.println("6 - Sair\n");
        System.out.printf("Opcao escolhida: ");
        try{
            opcao = Integer.parseInt(Banco.sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Tipo de opcao invalida!");
            Utils.pausa(2);
            Banco.menu();
        }

        switch (opcao){
            case 1:
                Banco.criarConta();
                break;
            case 2:
                Banco.efetuarSaque();
                break;
            case 3:
                Banco.efetuarDeposito();
                break;
            case 4:
                Banco.efetuarTransferencia();
                break;
            case 5:
                Banco.listarContas();
                break;
            case 6:
                System.out.println("Finalizando sistema!");
                Utils.pausa(2);
                System.exit(0);
            default:
                System.out.println("Opcao invalida!");
                Utils.pausa(2);
                Banco.menu();
                break;
        }
    }
    public static void criarConta(){
        System.out.println("Informe os dados do cliente");
        System.out.printf("Nome e sobrenome: ");
        String nome = Banco.sc.nextLine();
        System.out.printf("E-mail: ");
        String email = Banco.sc.nextLine();
        System.out.printf("CPF: ");
        String cpf = Banco.sc.nextLine();
        System.out.printf("Data de nascimento: ");
        String data_nascimento = Banco.sc.nextLine();
        System.out.println();

        Cliente cliente = new Cliente(nome, email, cpf, Utils.stringParaData(data_nascimento));
        Conta conta = new Conta(cliente);
        Banco.contas.add(conta);

        System.out.println("Conta criada com sucesso!\n");
        System.out.println("Dados registrados: ");
        System.out.println(conta+"\n");
        Utils.pausa(3);
        Banco.menu();
    }
    public static void efetuarSaque(){
        System.out.printf("Informe o numero da conta: ");
        int numero = Banco.sc.nextInt();
        Conta conta = Banco.buscarContaPorNumero(numero);
        if (conta != null) {
            System.out.printf("Informe o valor para saque: ");
            Double valor = Banco.sc.nextDouble();
            conta.sacar(valor);
        }else{
            System.out.println("Conta nao encontrada!");
        }
        Utils.pausa(3);
        Banco.menu();
    }
    public static void efetuarDeposito(){
        System.out.printf("Informe o numero da conta: ");
        int numero = Banco.sc.nextInt();

        Conta conta = Banco.buscarContaPorNumero(numero);

        if (conta != null) {
            System.out.printf("Informe o valor para deposito: ");
            Double valor = Banco.sc.nextDouble();
            conta.depositar(valor);
        } else {
            System.out.println("Conta nao encontrada!");
        }
        Utils.pausa(3);
        Banco.menu();
    }
    public static void efetuarTransferencia(){
        System.out.printf("Informe a conta de origem: ");
        int numero_origem = Banco.sc.nextInt();
        Conta conta_origem = Banco.buscarContaPorNumero(numero_origem);

        if (conta_origem != null) {
            System.out.printf("Informe a conta de destino: ");
            int numero_destino = Banco.sc.nextInt();
            Conta conta_destino = Banco.buscarContaPorNumero(numero_destino);

            if (conta_destino != null) {
                System.out.printf("Informe o valor da transferencia: ");
                Double valor = Banco.sc.nextDouble();
                conta_origem.transferir(conta_destino, valor);
                System.out.println("Conta destino encontrada!");
            } else {
                System.out.println("Conta destino nao encotranda!");
            }
        }else{
            System.out.println("Conta nao encontrada!");
        }
        Utils.pausa(3);
        Banco.menu();
    }
    public static void listarContas(){
        if (Banco.contas.size()>0) {
            System.out.println("Listagem de contas\n");
            for (Conta conta: Banco.contas) {
                System.out.println(conta+"\n");
                Utils.pausa(2);
            }
            System.out.println();
        } else {
            System.out.println("Nao existem contas cadastradas!");
        }
        Utils.pausa(3);
        Banco.menu();
    }

    private static Conta buscarContaPorNumero(int numero){
        Conta c = null;
        if (Banco.contas.size()>0) {
            for (Conta conta: Banco.contas) {
                if (conta.getNumero() == numero) {
                    c = conta;
                }
            }
        }
        return c;
    }
}
