/*Documenta��o com Javadoc:*/
/**
 * Ao se fazer uso de um atributo public de outro pacote � preciso importar
 * @author Positivo
 *
 */

package br.geekuniversity.secao01;
import br.geekuniversity.secao11_.Cliente;
public class Programa26 {

	public static void main(String[] args) {
		Cliente cli = new Cliente(64, "Astrovaldo Guerreiro", "Qnm 81, Conj 30, Casa 18");

		//S�o privates, n�o podem ser acessados dessa forma:
		//System.out.println("Cliente: " + cli.nome);
		//System.out.println("Endere�o: " + cli.endereco);
		System.out.println(cli.getEndereco());
		

	}

}
