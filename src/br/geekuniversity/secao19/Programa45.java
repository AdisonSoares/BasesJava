/*Listas 01 - Collections(Coleções)
 *São tipos de dados,classes/interfaces, onde se guarda tipos variados
 *de dados desde que não seja especificado.
 *Ex: ArrayList<String> nomes = new ArrayList<String>();
 *Nesse exemplo será possivel armazenar Strings mas não outro tipo
 *
 *OBS - A MELHOR FORMA DE DECLARAR UM ARRAY LIST É COMO LIST(INTERFACE), 
 *POIS DEPOIS PODE SER TROCADO O TIPO DE ARRAY PARA LINKED (CLASSE)*/

package br.geekuniversity.secao19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa45 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List nomes = new ArrayList();
		
		/*Adicionando dados String*/
		nomes.add("Maria");
		nomes.add("Joao");
		nomes.add("Clarice");
		
		/*Adicionando dados de tipos variados*/
		nomes.add(44);
		nomes.add(true);
		nomes.add(4.5);
		nomes.add('a');
		
		/*Exibicao estilo array*/
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(2));
		System.out.println();
		
		/*Verificar o tamanho da lista*/
		System.out.println("Tamanho da lista:"+nomes.size());
		System.out.println();
		
		/*La�o foreach*/
		System.out.println("Exibicao com laco foreach:");
		for (Object objNome : nomes) {
			System.out.println(objNome);
		}
		System.out.println();
		
		/*La�o for*/
		System.out.println("Exibicao com laco for:");
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		System.out.println();
		
		/*Exibir de forma ordenada vai funcionar quando definir o tipo de Arraylist - ERRO*/
		Collections.sort(nomes);
		System.out.println("Exibicao com laco foreach:");
		for (Object objNome : nomes) {
			System.out.println(objNome);
		}
		System.out.println();
	}
}
