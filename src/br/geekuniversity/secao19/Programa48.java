/*Conjuntos
 *S�o implementados com interface Set, uma das classes
 *que o implementam � o HashSet.
 *A maioria das cole��es possuem os mesmos m�todos j�
 *conhecidos e utilizados com as listas, "add", "get", "size".
 *A diferen�a est� no comportamento dos objetos, tendo uma
 *melhor performance do que em listas.
 *OBS - OS CONJUNTOS N�O ACEITAM DADOS DUPLICADOS E REALIZA UM TIPO
 *DE ORDENA��O, N�O ACEITA ORDENA��O POR MEIO DO COLLECTIONS.SORT();
 *N�O TEM �NDICE COMO UMA LISTA, � DO TIPO BOOLEANO, SEU RETORNO �
 *TRUE OU FALSE, A VANTAGEM EST� NO CONTROLE DE REPETI��O POR�M
 *ESSE CONTROLE FALHA POIS DIFERE MAIUSCULO DE MINUSCULO E ESPA�O.*/

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
		//nomes.add("Maria DB"); - Nao adiciona ao contrario da lista
		nomes.add("Maria DB");
		nomes.add("Mylton Siquira");
		nomes.add("Jair Sobrinho");
		nomes.add("Priscila Timoteo");
		System.out.println();
		
		/*Tamanho do conjunto*/
		System.out.print("Tamanho do conjunto - ");
		System.out.println(nomes.size());
		System.out.println();
		
		/*Exibir dados com la�o foreach*/
		System.out.println("Exibir dados com laco foreach:");
		for(String nome: nomes) {
			System.out.println(nome);
		}
		System.out.println();
		
		/*Usando na pratica*/
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o "+(i+1)+"eh nome: ");
			String nome = sc.nextLine();
			boolean teste = palavras.add(nome);
			if(!teste) {
				System.out.println("Nome repetido!");
				i--;
			}		
		}
		System.out.println();
		
		/*Exibir dados com laco foreach*/
		System.out.println("Exibir dados com laco foreach:");
		for(String nome: palavras) {
			System.out.println(nome);
		}
		System.out.println();
	}
}
