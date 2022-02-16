/*Documenta��o por Javadoc:*/
/**
 * Fun��es ou M�todos parte 1
 * 
 * Uma fun��o deve ter:
 * a)Tipo de retorno(Tipo de dado que a fun��o retorna).
 * b)Nome - Corresponde a a��o que o m�todo/fun��o realiza.
 * c)Par�metros/Argumentos de entrada(Opcional).
 * d)Retorno de acordo com o tipo de fun��o ou m�todo
 * (Sem retorno em void e obrigat�rio para outro tipo).
 * 
 * @author Positivo
 *
 */

/*Fa�a um programa que receba diversos nomes
 de frutas do usu�rio e no final imprima essas
 frutas em ordem contr�ria. O programa deve solicitar
 ao usu�rio quantas frutas ele quer informar. 
 OBS - Void significa vazio, sem retorno
 OBS - Atalho para identar tudo CTRL+SHIFT+F
 OBS - Atalho para organizar os imports CTRL+SHIFT+O
 Varivel global fica acess�vel em toda a classe e precisa ter o acesso estatico
*/

package br.geekuniversity.secao08;
import java.util.Scanner;
public class Programa20 {
	static String frutas[];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int qtd;
		System.out.println("Informa a quantidade de frutas:");
		qtd = Integer.parseInt(sc.nextLine());// Corrigir o bug do String seguido de int

		cadastrar_dados(qtd);
		mostrar_dados(qtd);

	}

	static void cadastrar_dados(int qtd) {
		frutas = new String[qtd];
		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Informe a " + (i + 1) + "� fruta");
			frutas[i] = sc.nextLine();
		}
	}

	static void mostrar_dados(int qtd) {
		for (int i = (qtd - 1); i >= 0; i--) {
			System.out.println(frutas[i]);
		}
	}
}
