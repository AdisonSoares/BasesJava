/*Mapas/map
 *Mapas são representados pela interface Map, e mapeiam
 *seus elementos utilizando o conceito de chave/valor.
 *Mapas representam 3 coleçoes:
 *-Coleção de chaves;
 *-Coleção de valores;
 *-Coleção de associações;*/

package br.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Programa50 {
	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		/*Método para adicionar*/
		pessoas.put(31, "Joel Souza");
		pessoas.put(27, "Maria DB");
		pessoas.put(42, "Jair Silva");
		
		/*Iterar dados*/
		pessoas.keySet().forEach(idade ->{
			System.out.println(pessoas.get(idade));
		});
		System.out.println();
		
		/*Coleçao de chaves*/
		System.out.println("Coleçao de chaves");
		System.out.println(pessoas.keySet());
		System.out.println();
		
		/*Coleção de valores*/
		System.out.println("Coleção de valores");
		System.out.println(pessoas.values());
		System.out.println();
		
		/*Coleção de associação*/
		System.out.println("Coleção de associação");
		System.out.println(pessoas.entrySet());
		System.out.println();
		
		/*Exibir na coleção de chaves*/
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade: chaves) {
			System.out.println(idade);
		}
		System.out.println();
		
		/*Exibir na coleção de valores*/
		Collection<String>  valores = pessoas.values();
		for (String nome : valores) {
			System.out.println(nome);
		}
		System.out.println();
		
		/*Exibir na coleção de valores com foreach*/
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		System.out.println();
		
		/*Exibir a coleção de associação*/
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao: associacoes) {
			System.out.println(associacao.getKey()+" - "+ associacao.getValue());
		}
		System.out.println();
		
		/*Exibir a coleção de associação com foreach*/
		pessoas.entrySet().forEach(associacao->{
			System.out.println(associacao.getKey()+" - "+ associacao.getValue());
		});
		System.out.println();
	}
}
