/*Documentação por Javadoc:*/
/**
 * Instrução Switch case
 * @author Positivo
 *
 */

package br.geekuniversity.secao04;
public class Programa06 {
	public static void main(String[] args) {
		int numero=3;
		
		switch (numero) {
			case 1:
				System.out.println("O número é 1");
				break;
			case 3:
				System.out.println("O número é 3");
				break;
			case 5:
				System.out.println("O número é 5");
				break;
			default:
				System.out.println("O número é "+numero);
				break;
		}
	}
}
