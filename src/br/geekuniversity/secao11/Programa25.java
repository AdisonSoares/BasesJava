/*No exemplo da tentativa de saque além do saldo o programa não permite o saque
 *continuando com o saldo anterior.
 *Não se pode deixar variáveis disponíveis para os clientes é preciso encapsular para
 *não se ter problemas com a quebra do código ou acesso direto à variável.
 *Para se ter acesso ao método ou variável encapsulada com o modificador de acesso
 *private é preciso usar os métodos getters e setters.
 *O método Getter é um método público que serve para consultar dados.
 *A nomenclatura desses métodos é public tipoDeVariável getnomeDoAtributo().
 *O ideal é que todos os atributos de uma classe sejam privados.*/

package br.geekuniversity.secao11;
import br.geekuniversity.secao11.Cliente;
import br.geekuniversity.secao11.Conta;

@SuppressWarnings("unused")
public class Programa25 {
	public static void main(String[] args) {
		Cliente cliente_1 = new Cliente(45, "João de Barro", "Qnl 20, Conj 03, Casa 02");
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
