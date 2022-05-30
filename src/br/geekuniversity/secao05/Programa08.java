/*Documentação por Javadoc:*/
/**
 * A variável do tipo Scanner vai capturar a informação Do While
 * Correção do bug do laço de repetição com String e int
 */
package br.geekuniversity.secao05;

import java.util.Scanner;

public class Programa08 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = 1;
		String nome;
		// Sempre executa e depois verifica o valor
		do {
			System.out.println("Informe seu nome");
			nome = sc.nextLine();
			System.out.println("Digite sua idade");
			// idade=sc.nextInt();//BUG
			idade = Integer.parseInt(sc.nextLine());

			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println();
		} while (idade > 0);
	}
}
