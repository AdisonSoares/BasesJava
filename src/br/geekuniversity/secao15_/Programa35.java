//Métodos Estáticos
/*Um método estático não depende de uma instância da classe
**para ser utilizado.
**Exemplo: nomeDaClasse.metodo(){}*/

package br.geekuniversity.secao15_;

import br.geekuniversity.secao15.Conta;

public class Programa35 {

	public static void main(String[] args) {
		Conta cliente1 = new Conta("Meu cliente");
		
		System.out.println("Número da conta: "+cliente1.getNumero());
		System.out.println("Cliente: "+cliente1.getCliente());
		System.out.println("A próxima conta será: "+Conta.proximaConta());

	}

}
