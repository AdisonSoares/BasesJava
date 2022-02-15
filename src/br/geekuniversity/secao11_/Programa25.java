/*No exemplo da tentativa de saque al�m do saldo o programa n�o permite o saque
 *continuando com o saldo anterior.
 *N�o se pode deixar vari�veis dispon�veis para os clientes � preciso encapsular para
 *n�o se ter problemas com a quebra do c�digo ou acesso direto � vari�vel.
 *Para se ter acesso ao m�todo ou vari�vel encapsulada com o modificador de acesso
 *private � preciso usar os m�todos getters e setters.
 *O m�todo Getter � um m�todo p�blico que serve para consultar dados.
 *A nomenclatura desses m�todos � public tipoDeVari�vel getnomeDoAtributo().
 *O ideal � que todos os atributos de uma classe sejam privados.*/
package br.geekuniversity.secao11_;

import br.geekuniversity.secao11.Cliente;
import br.geekuniversity.secao11.Conta;

public class Programa25 {
	public static void main(String[] args) {
		Cliente cliente_1 = new Cliente(45, "Jo�o de Barro", "Qnl 20, Conj 03, Casa 02");
		Cliente cliente_2 = new Cliente(14, "Maria Gilda", "Qnj 40, Conj 08, Apt 201");

		Conta conta_1 = new Conta(1, 100.00f, 200.00f, cliente_1);
		Conta conta_2 = new Conta(2, 300.00f, 500.00f, cliente_2);

		System.out.println("Saldo cliente_1: " + conta_1.getSaldo());
		System.out.println("Saldo cliente_2: " + conta_2.getSaldo());
		System.out.println();

		conta_1.sacar(300);
		System.out.println("Saldo cliente_1 depois do saque: " + conta_1.getSaldo());

	}

}
