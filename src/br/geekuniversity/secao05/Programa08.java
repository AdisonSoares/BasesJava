package br.geekuniversity.secao05;
// A vari�vel do tipo Scanner vai capturar a informa��o
//Do While
//Corre��o do bug do la�o de repeti��o com String e int
import java.util.Scanner;
public class Programa08 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade=1;
		String nome;
	//Sempre executa e depois verifica o valor
			do {
				System.out.println("Informe seu nome");
				nome=sc.nextLine();
				System.out.println("Digite sua idade");
				//idade=sc.nextInt();//BUG
				idade=Integer.parseInt(sc.nextLine());
				
				System.out.println("Nome: "+nome);
				System.out.println("Idade: "+idade);
				System.out.println();
			}while(idade>0);
	}
}
