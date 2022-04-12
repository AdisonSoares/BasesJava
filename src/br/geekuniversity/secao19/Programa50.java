/*Mapas/map
 *Mapas s�o representados pela interface Map, e mapeiam
 *seus elementos utilizando o conceito de chave/valor.
 *Mapas representam 3 cole�oes:
 *-Cole��o de chaves;
 *-Cole��o de valores;
 *-Cole��o de associa��es;*/

package br.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Programa50 {
	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		/*M�todo para adicionar*/
		pessoas.put(31, "Joel Souza");
		pessoas.put(27, "Maria DB");
		pessoas.put(42, "Jair Silva");
		
		//Iterar dados - Função aceita jdk acima de 7
		pessoas.keySet().forEach(idade ->{
			System.out.println(pessoas.get(idade));
		});
		System.out.println();

		
		/*Colecao de chaves*/
		System.out.println("Colecao de chaves");
		System.out.println(pessoas.keySet());
		System.out.println();
		
		/*Colecao de valores*/
		System.out.println("Colecoes de valores");
		System.out.println(pessoas.values());
		System.out.println();
		
		/*Colecao de associacao*/
		System.out.println("Colecao de associacao");
		System.out.println(pessoas.entrySet());
		System.out.println();
		
		/*Exibir na colecao de chaves*/
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade: chaves) {
			System.out.println(idade);
		}
		System.out.println();

		
		/*Exibir na colecao de valores*/
		Collection<String>  valores = pessoas.values();
		for (String nome : valores) {
			System.out.println(nome);
		}
		System.out.println();
		
		//Exibir na colecao de valores com foreach - Função aceita jdk acima de 7
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		System.out.println();

		/*Exibir a colecao de associacao*/
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao: associacoes) {
			System.out.println(associacao.getKey()+" - "+ associacao.getValue());
		}
		System.out.println();
		
		//Exibir a colecao de associacao com foreach - Função aceita jdk acima de 7
		pessoas.entrySet().forEach(associacao->{
			System.out.println(associacao.getKey()+" - "+ associacao.getValue());
		});
		System.out.println();
	}
}
