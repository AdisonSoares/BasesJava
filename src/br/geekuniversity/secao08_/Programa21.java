/*Documentação por Javadoc:*/
//
/**
 * Funções ou Métodos parte 2
 * @author Positivo
 *
 */

package br.geekuniversity.secao08_;
public class Programa21 {
	public static void main(String[] args) {
		int valor1 = 6, valor2 = 4, res;

		res = soma(valor1, valor2);

		System.out.println("Resultado= " + res);
		// ou
		System.out.println("Resultado= " + soma(valor1, valor2));
		
		System.out.println(mensagem());
		
	}
	private static String mensagem() {
		return "Olá usuário";
	}

	private static int soma(int valor1, int valor2) {
		return valor1+valor2;
	}
}
