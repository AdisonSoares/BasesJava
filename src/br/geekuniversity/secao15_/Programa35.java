//M�todos Est�ticos
/*Um m�todo est�tico n�o depende de uma inst�ncia da classe
**para ser utilizado.
**Exemplo: nomeDaClasse.metodo(){}*/

package br.geekuniversity.secao15_;

import br.geekuniversity.secao15.Conta;

public class Programa35 {

	public static void main(String[] args) {
		Conta cliente1 = new Conta("Meu cliente");
		
		System.out.println("N�mero da conta: "+cliente1.getNumero());
		System.out.println("Cliente: "+cliente1.getCliente());
		System.out.println("A pr�xima conta ser�: "+Conta.proximaConta());

	}

}
