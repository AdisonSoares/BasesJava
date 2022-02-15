/*Listas 02 - Acrescentando tipos primitivos*/

package br.geekuniversity.secao19_;
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
		
		/*Laço foreach - String*/
		System.out.println("Exibição foreach Strings:");
		for(String strPalavra: palavras) {
			System.out.println(strPalavra);
		}
		System.out.println();
		
		/*Laço foreach - Integer*/
		System.out.println("Exibição foreach Integer:");
		for(Integer intgNumero: numeros) {
			System.out.println(intgNumero);
		}
		System.out.println();
		
		/*Exibição ordenada laço foreach - String*/
		Collections.sort(palavras);
		System.out.println("Exibição ordenada foreach Strings:");
		for(String strPalavra: palavras) {
			System.out.println(strPalavra);
		}
		System.out.println();
		
		/*Exibição ordenada laço foreach - Integer*/
		Collections.sort(numeros);
		System.out.println("Exibição ordenada foreach Integer:");
		for(Integer intgNumero: numeros) {
			System.out.println(intgNumero);
		}
		System.out.println();
	}
}
