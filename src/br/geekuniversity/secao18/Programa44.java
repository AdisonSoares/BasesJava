/*Escrevendo em arquivos 02*/

package br.geekuniversity.secao18;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/* Imprimir em arquivo - Sem sobrescrita */
		try {
			PrintStream mensagem02 = new PrintStream(new FileOutputStream("saida.txt", true));
			System.out.print("Escreva uma mensagem:");
			String mensagem03 = sc.nextLine();
			mensagem02.println(mensagem03);
			mensagem02.close();
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel criar o arquivo de mensagem");
		}

		sc.close();
	}
}
