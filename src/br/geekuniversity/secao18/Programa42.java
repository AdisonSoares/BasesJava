/*Escrevendo em arquivos 01*/

/*Pacotes/Importa��es*/
package br.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/*M�todo main*/
public class Programa42 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* Imprimir em arquivo - Sobrescrita */
		try {
			PrintStream mensagem02 = new PrintStream("saida.txt");
			System.out.print("Escreva uma mensagem:");
			String mensagem03 = sc.nextLine();
			mensagem02.println(mensagem03);
			mensagem02.close();
		} catch (FileNotFoundException e) {
			System.out.println("N�o foi possivel criar o arquivo de mensagem");
		}

		/* Imprimir no console */
		System.out.print("Escreva uma mensagem:");
		String mensagem01 = sc.nextLine();
		System.out.println(mensagem01);

		sc.close();
		
	}
}
