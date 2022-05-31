/*Documentação por Javadoc:*/
/**
 * Funções ou Métodos parte 1
 * 
 * Uma função deve ter:
 * a)Tipo de retorno(Tipo de dado que a função retorna).
 * b)Nome - Corresponde a ação que o método/função realiza.
 * c)Parâmetros/Argumentos de entrada(Opcional).
 * d)Retorno de acordo com o tipo de função ou método
 * (Sem retorno em void e obrigatório para outro tipo).
 */

/*Faça um programa que receba diversos nomes
 de frutas do usuário e no final imprima essas
 frutas em ordem contrária. O programa deve solicitar
 ao usuário quantas frutas ele quer informar. 
 OBS - Void significa vazio, sem retorno
 OBS - Atalho para identar tudo CTRL+SHIFT+F
 OBS - Atalho para organizar os imports CTRL+SHIFT+O
 Varivel global fica acessível em toda a classe e precisa ter o acesso estatico
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
			System.out.println("Informe a " + (i + 1) + "º fruta");
			frutas[i] = sc.nextLine();
		}
	}

	static void mostrar_dados(int qtd) {
		for (int i = (qtd - 1); i >= 0; i--) {
			System.out.println(frutas[i]);
		}
	}
}
