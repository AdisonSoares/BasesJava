/*Documenta��o por Javadoc:*/
/**
 * Operador Tern�rio
 * Usado quando se tem apenas recurso com um if e else
 * @author Positivo
 *
 */

package br.geekuniversity.secao04;

public class Programa05 {
	public static void main(String[] args) {
		int valor = 3;
		int numero;

		// Procedimento com if else
		if (valor > 0) {
			numero = valor;
		} else {
			numero = 7;
		}
		System.out.println(numero);

		// Procedimento com operador tern�rio
		// Se o valor for menor que 0 recebe "valor" sen�o recebe "7"
		numero = (valor > 0) ? valor : 7;
		System.out.println(numero);

		// Se o valor for maior que 0 recebe "valor" sen�o recebe "7"
		numero = (valor < 0) ? valor : 7;
		System.out.println(numero);
	}
}
