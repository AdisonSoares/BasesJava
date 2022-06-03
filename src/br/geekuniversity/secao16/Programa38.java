/*A função "divisão" avisará a possibilidade de uma Exception,
 *e apenas vai deixar o programa rodar se for tratada com try catch.
 *Deixando no catch apenas o Exception já é feita uma análise completa.
 *É possivel colocar mais de uma tentativa(catch). */

package br.geekuniversity.secao16;
import java.util.Scanner;

public class Programa38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor:");
		int n1 = sc.nextInt();
		System.out.print("Digite o segundo valor:");
		int n2 = sc.nextInt();

		try {
			System.out.println("Resultado da divisão:" + divisao(n1, n2));
		} catch (ArithmeticException e) {
			System.out.println("Não foi possível fazer a divisão");
		} catch (Exception e) {
			System.out.println("Exceção tratada para sair a exigencia do eclipse");
		}
		sc.close();

	}
	
	public static int divisao(int n1, int n2) throws Exception {
		return n1 / n2;
	}
}
