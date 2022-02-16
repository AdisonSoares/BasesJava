//Atributos Est�ticos
/*Atributos est�ticos s�o atributos, onde os valores s�o compartilhados
**entre as instancias da classe, mesmo dentro de outra classe precisa instanciar.*/

package br.geekuniversity.secao15_;

import br.geekuniversity.secao15_.Conta;

@SuppressWarnings("unused")
public class Programa34 {

	public static void main(String[] args) {
		Conta conta1 = new Conta("Julieta Borges");
		System.out.println(conta1.getCliente());
		System.out.println(conta1.getNumero());
		System.out.println();
		
		Conta conta2 = new Conta("Carmen Alicia");
		System.out.println(conta2.getCliente());
		System.out.println(conta2.getNumero());
		System.out.println();
		
		//Modificar uma vari�vel est�tica
		Conta.contador = 40;
		System.out.println(Conta.contador);

	}

}
