/*Ao se fazer uso de um atributo public de outro pacote é preciso
**importar.*/

package br.geekuniversity.secao_01;

import br.geekuniversity.secao11.Cliente;

public class Programa26 {

	public static void main(String[] args) {
		Cliente cli = new Cliente("Astrovaldo Guerreiro", "Qnm 81, Conj 30, Casa 18");

		//São privates, não podem ser acessados dessa forma:
		//System.out.println("Cliente: " + cli.nome);
		//System.out.println("Endereço: " + cli.endereco);
		System.out.println(cli.getEndereco());
		

	}

}
