/*Documentação por Javadoc:*/
/**
 * Laço For
 * @author Positivo
 *
 */

package br.geekuniversity.secao05_;

import java.util.Scanner;

public class Programa09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = 1;
		String nome;

		// Variável de controle; condição de parada; forma de incremento
		for (int i = 0; i < 2; i++) {
			System.out.println("Informe seu nome");
			nome = sc.nextLine();
			System.out.println("Digite sua idade");
			// idade=sc.nextInt();//BUG
			idade = Integer.parseInt(sc.nextLine());

			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println();

			sc.close();

		}
	}

}
