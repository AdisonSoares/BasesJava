/*Modificador de acesso private
 * O private torna aquele atributo exclusivo da classe, ou seja, somente
 * a classe pode acessar e modificar ela, n�o se pode importar para outra classe
 * mesmo estando no mesmo projeto.*/

package br.geekuniversity.secao11;

import br.geekuniversity.secao11.Cliente;

@SuppressWarnings("unused")
public class Programa27 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(27, "Creuza Ziranda", "Rua sem nome, sem numero, sem nada");
		
		System.out.println("Nome "+cli1.getNome());
		System.out.println("Endere�o "+cli1.getEndereco());
		
		//Agora s�o private n�o podem ser acessados dessa forma
		//System.out.println("Nome: " + cli1.nome);
		//System.out.println("Endere�o: " + cli1.endereco);
		//cli1.dizer_oi();
	}

}
