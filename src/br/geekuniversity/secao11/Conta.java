/* A classe apresenta os m�todos sacar e depositar.
 * O m�todo sacar apresenta algumas condi�oes.
 * O destaque fica para a condi�ao do saque ser menor ou igual a saldo+limite,
 * caso a retirada tenha um valor menor ou igual a zero o saldo � atualizado
 * para zero, nessa mesma l�gica ao atualizar o limite, usa-se o resultado negativo
 * da retirada para tirar do limite, como toda vez vai ser um valor negativo
 * � preciso somar o valor negativo para subtrair do limite e atualiza-lo.
 * 
 * O modificador de acesso public torna publico o determinado objeto, as classes os
 * construtores sempre s�o public.
 * Os atributos podem ser public, private, protected.
 * Dizer que uma classe, construtor ou atributo � p�blic quer dizer que podem ser
 * acessados em todo o projeto.
 * Normalmente todos os atributos de uma classe s�o privados.
 * 
 * O private torna aquele atributo exclusivo da classe, ou seja, somente
 * a classe pode acessar e modificar ela, n�o se pode importar para outra classe
 * mesmo estando no mesmo projeto.*/

package br.geekuniversity.secao11;
public class Conta {
	private int conta;
	private float saldo, limite;
	private Cliente cliente;

	public Conta(int conta, float saldo, float limite, Cliente cliente) {
		this.conta = conta;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}

	// ----------------------------------//
	public void sacar(float saque) {
		if (saque <= (this.saldo)) {
			this.saldo = this.saldo - saque;

		} else if (saque <= (this.saldo + this.limite)) {
			float retirada = this.saldo - saque;
			if (retirada <= 0) {
				this.saldo = 0;
			}
			retirada = this.limite + retirada;
			this.limite = retirada;

		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	// ----------------------------------//
	public void depositar(float deposito) {
		this.saldo = this.saldo + deposito;
	}

	// ----------------------------------//
	public float getSaldo() {
		return this.saldo + this.limite;
	}

	public float getLimite() {
		return this.limite;
	}

}
