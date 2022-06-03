/*Gerando executáveis com jar.
 *JAR - Java Archive (Arquivo compactado java).*/

package br.geekuniversity.secao17;
import java.util.Scanner;
import br.geekuniversity.secao11.Cliente;
import br.geekuniversity.secao11.Conta;

public class Principal {

	/* OBJETOS */
	static Cliente cliente = new Cliente(28 ,"Geraldo Magela", "Qn 18b, Casa 08, Lote 05");
	static Conta conta = new Conta(1, 200, 300, cliente);
	static Scanner sc = new Scanner(System.in);

	/* MÉTODOS */
	public static void depositar() {
		System.out.println("----------Depósito-----------");
		System.out.print("Informe o valor para depósito: ");
		float valor = sc.nextFloat();
		if (valor > 0) {
			conta.depositar(valor);
			System.out.println("Deposito efetuado");
		} else {
			System.out.println("Valor precisa ser positivo");
		}
	}

	public static void sacar() {
		System.out.println("----------Sacar-----------");
		System.out.print("Informe o valor para saque: ");
		float valor = sc.nextFloat();
		if (valor > 0) {
			conta.sacar(valor);
			System.out.println("Saque efetuado");
		} else {
			System.out.println("Valor precisa ser positivo");
		}
	}

	public static void consultar() {
		System.out.println("----------Consultar-----------");
		System.out.println("Seu saldo é: " + conta.getSaldo());
	}

	/* MÉTODOS MAIN */
	public static void main(String[] args) {
		int opcao = 0;
		System.out.println("--Bem vindo ao banco--\n");

		do {
			System.out.println("Selecione uma opção do menu abaixo:\n");
			System.out.println("1-Depositar");
			System.out.println("2-Sacar");
			System.out.println("3-Consultar saldo");
			System.out.println("0-Sair");
			opcao = sc.nextInt();

			switch (opcao) {
			case 0: {
				break;
			}
			case 1: {
				depositar();
				break;
			}
			case 2: {
				sacar();
				break;
			}
			case 3: {
				consultar();
				break;
			}
			default:
				System.out.println("Opção incorreta");
			}
		} while (opcao >= 0);
		
		sc.close();
	}
}
