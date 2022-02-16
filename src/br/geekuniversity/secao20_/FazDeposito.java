/*O método run vai executar em paralelo e depositar um valor na conta*/

package br.geekuniversity.secao20_;
import br.geekuniversity.secao11.Conta;

public class FazDeposito implements Runnable{
	private Conta conta;
	
	public FazDeposito(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void run() {
		this.conta.depositar(100.0f);
	}
}
