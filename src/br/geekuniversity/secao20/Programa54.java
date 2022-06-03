package br.geekuniversity.secao20;
import br.geekuniversity.secao11.Cliente;
import br.geekuniversity.secao11.Conta;

public class Programa54 {
	public static void main(String[] args) throws InterruptedException {
		Cliente cliente01 = new Cliente(31, "Celina Xavier", "Quadra 52");
		Conta conta01 = new Conta(1, 200, 300, cliente01);

		/**
		 * O método alterna entre a thrd01 e thrd02, soma individualmente 100 reais
		 * ou mostra o valor original pois cada um acessa do original.
		 */
		FazDeposito acao = new FazDeposito(conta01);
		Thread thrd01 = new Thread(acao);
		Thread thrd02 = new Thread(acao);
		
		thrd01.start();// Saldo 600 reais
		thrd02.start();// Saldo 700 reais
		
		/**
		 * Sincronização, é preciso ir no programa fonte (classe conta -M deposita) para acionar
		 */
		thrd01.join();
		thrd02.join();
		
		System.out.println(conta01);// Saldo 700 reais fixo - Sincronizado
	}
}
