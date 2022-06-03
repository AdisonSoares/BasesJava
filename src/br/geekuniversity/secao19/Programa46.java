/*Listas 02 - Acrescentando tipos primitivos*/

package br.geekuniversity.secao19;
import java.util.ArrayList;
import java.util.Collections;

public class Programa46 {
	public static void main(String[] args) {
		
		ArrayList<String> palavras = new ArrayList<String>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		/*Adicionando Strings*/
		palavras.add("Evaldo");
		palavras.add("Marcia");
		palavras.add("Adriana");
		palavras.add("Bruna");
		palavras.add("Bianca");
		
		/*Adicionando numeros inteiros*/
		numeros.add(45);
		numeros.add(12);
		numeros.add(50);
		numeros.add(4);
		
		/*Laco foreach - String*/
		System.out.println("Exibicao foreach Strings:");
		for(String strPalavra: palavras) {
			System.out.println(strPalavra);
		}
		System.out.println();
		
		/*Laco foreach - Integer*/
		System.out.println("Exibicao foreach Integer:");
		for(Integer intgNumero: numeros) {
			System.out.println(intgNumero);
		}
		System.out.println();
		
		/*Exibicao ordenada laco foreach - String*/
		Collections.sort(palavras);
		System.out.println("Exibicao ordenada foreach Strings:");
		for(String strPalavra: palavras) {
			System.out.println(strPalavra);
		}
		System.out.println();
		
		/*Exibicao ordenada laço foreach - Integer*/
		Collections.sort(numeros);
		System.out.println("Exibicao ordenada foreach Integer:");
		for(Integer intgNumero: numeros) {
			System.out.println(intgNumero);
		}
		System.out.println();
	}
}
