/*Conjuntos
 *São implementados com interface Set, uma das classes
 *que o implementam é o HashSet.
 *A maioria das coleções possuem os mesmos métodos já
 *conhecidos e utilizados com as listas, "add", "get", "size".
 *A diferença está no comportamento dos objetos, tendo uma
 *melhor performance do que em listas.
 *OBS - OS CONJUNTOS NÃO ACEITAM DADOS DUPLICADOS E REALIZA UM TIPO
 *DE ORDENAÇÃO, NÃO ACEITA ORDENAÇÃO POR MEIO DO COLLECTIONS.SORT();
 *NÃO TEM ÍNDICE COMO UMA LISTA, É DO TIPO BOOLEANO, SEU RETORNO É
 *TRUE OU FALSE, A VANTAGEM ESTÁ NO CONTROLE DE REPETIÇÃO PORÉM
 *ESSE CONTROLE FALHA POIS DIFERE MAIUSCULO DE MINUSCULO E ESPAÇO.*/

package br.geekuniversity.secao19;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa48 {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		Set<String> palavras = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
		/*Inserindo dados*/
		//nomes.add("Maria DB"); - Não adiciona ao contrario da lista
		nomes.add("Maria DB");
		nomes.add("Mylton Siquira");
		nomes.add("Jair Sobrinho");
		nomes.add("Priscila Timoteo");
		System.out.println();
		
		/*Tamanho do conjunto*/
		System.out.print("Tamanho do conjunto - ");
		System.out.println(nomes.size());
		System.out.println();
		
		/*Exibir dados com laço foreach*/
		System.out.println("Exibir dados com laço foreach:");
		for(String nome: nomes) {
			System.out.println(nome);
		}
		System.out.println();
		
		/*Usando na prática*/
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o "+(i+1)+"º nome: ");
			String nome = sc.nextLine();
			boolean teste = palavras.add(nome);
			if(!teste) {
				System.out.println("Nome repetido!");
				i--;
			}		
		}
		System.out.println();
		
		/*Exibir dados com laço foreach*/
		System.out.println("Exibir dados com laço foreach:");
		for(String nome: palavras) {
			System.out.println(nome);
		}
		System.out.println();
	}
}
