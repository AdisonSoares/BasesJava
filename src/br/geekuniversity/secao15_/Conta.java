package br.geekuniversity.secao15_;

import br.geekuniversity.secao15_.Conta;

public class Conta {
	private int numero;
	private String cliente;
	public static int contador = 1;
	
	public Conta(String cliente) {
		this.numero = contador;
		this.cliente = cliente;
		Conta.contador = contador+1;
	}
	
	//Métodos Get e Set
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	/**
	 * Método estático
	 * @return valor do contador
	 */
	public static int proximaConta() {
		return Conta.contador;
	}

}
