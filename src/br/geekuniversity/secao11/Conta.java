/* A classe apresenta os métodos sacar e depositar.
 * O método sacar apresenta algumas condiçoes.
 * O destaque fica para a condiçao do saque ser menor ou igual a saldo+limite,
 * caso a retirada tenha um valor menor ou igual a zero o saldo é atualizado
 * para zero, nessa mesma lógica ao atualizar o limite, usa-se o resultado negativo
 * da retirada para tirar do limite, como toda vez vai ser um valor negativo
 * é preciso somar o valor negativo para subtrair do limite e atualiza-lo.
 * 
 * O modificador de acesso public torna publico o determinado objeto, as classes os
 * construtores sempre são public.
 * Os atributos podem ser public, private, protected.
 * Dizer que uma classe, construtor ou atributo é públic quer dizer que podem ser
 * acessados em todo o projeto.
 * Normalmente todos os atributos de uma classe são privados.
 * 
 * O private torna aquele atributo exclusivo da classe, ou seja, somente
 * a classe pode acessar e modificar ela, não se pode importar para outra classe
 * mesmo estando no mesmo projeto.*/

package br.geekuniversity.secao11;
public class Conta {
	@SuppressWarnings("unused")
	private int conta;
	private float saldo, limite;
	@SuppressWarnings("unused")
	private Cliente cliente;

	public Conta(int conta, float saldo, float limite, Cliente cliente) {
		this.conta = conta;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	// ----------------------------------//
	public Conta() { }
	
	// ----------------------------------//
	/**
	 * Método para sacar 
	 * @param valor de saque
	 */
	public void sacar(float saque) {
		if (saque <= (this.saldo)) {
			this.saldo = this.saldo - saque;
			System.out.println("Saque realizado");

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
	/**
	 * Metodo para deposito
	 * @param valor de deposito
	 */
	public void depositar(float deposito) {
		this.saldo = this.saldo + deposito;
	}

	// ----------------------------------//
	/**
	 * Metodo para mostrar o saldo
	 * @return valor atual
	 */
	public float getSaldo() {
		return this.saldo + this.limite;
	}
	/**
	 * Metodo para mostrar o limite
	 * @return limite atual
	 */
	public float getLimite() {
		return this.limite;
	}
	@Override
	public String toString() {
		return "O saldo da conta é: "+this.getSaldo();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Conta)) {
			return false;
		}else {
			Conta verificar = (Conta) obj;//Cast, trabalho com o obj como se fosse uma conta
			return verificar.getSaldo()==this.getSaldo();
		}
	}
}
