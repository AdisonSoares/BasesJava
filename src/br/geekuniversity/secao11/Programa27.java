/*Modificador de acesso private
 * O private torna aquele atributo exclusivo da classe, ou seja, somente
 * a classe pode acessar e modificar ela, não se pode importar para outra classe
 * mesmo estando no mesmo projeto.*/

package br.geekuniversity.secao11;

import br.geekuniversity.secao11.Cliente;

@SuppressWarnings("unused")
public class Programa27 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(27, "Creuza Ziranda", "Rua sem nome, sem numero, sem nada");
		
		System.out.println("Nome "+cli1.getNome());
		System.out.println("Endereço "+cli1.getEndereco());
		
		//Agora são private não podem ser acessados dessa forma
		//System.out.println("Nome: " + cli1.nome);
		//System.out.println("Endereço: " + cli1.endereco);
		//cli1.dizer_oi();
	}

}
