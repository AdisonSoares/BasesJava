/*A fun��o "divis�o" avisar� a possibilidade de uma Exception,
 *e apenas vai deixar o programa rodar se for tratada com try catch.
 *Deixando no catch apenas o Exception j� � feita uma an�lise completa.
 *� possivel colocar mais de uma tentativa(catch). */

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
			System.out.println("Resultado da divis�o:" + divisao(n1, n2));
		} catch (ArithmeticException e) {
			System.out.println("N�o foi poss�vel fazer a divis�o");
		} catch (Exception e) {
			System.out.println("Exce��o tratada para sair a exigencia do eclipse");
		}
		sc.close();

	}

	public static int divisao(int n1, int n2) throws Exception {
		return n1 / n2;
	}

}
