package br.geekuniversity.secao05;
// A variável do tipo Scanner vai capturar a informação
//While
//Correção do bug do laço de repetição com String e int
import java.util.Scanner;
public class Programa07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade=1;
		String nome;
		
		//Sempre confere o valor antes de executar
		while(idade>0) {
			System.out.println("Informe seu nome");
			nome=sc.nextLine();
			System.out.println("Digite sua idade");
			//idade=sc.nextInt();//BUG
			idade=Integer.parseInt(sc.nextLine());
			
			System.out.println("Nome: "+nome);
			System.out.println("Idade: "+idade);
			System.out.println();
		}
		
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
