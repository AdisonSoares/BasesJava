/*Documentação por Javadoc:*/
/**
 * Vetores parte 1
 * Arrays ou vetores unidimensionais
 * int vetor[5];
 * vetor[0]=1;//Primeiro elemento
 * vetor[1]=3;//Segundo elemento
 * vetor[2]=5;//Terceiro elemento
 * vetor[3]=7;//Quarto elemento
 * vetor[4]=9;//Quinto elemento
 * vetor[indice];*OBS-Para calcular o último elemento de um vetor se usa(n-1),
 * sendo n º de elementos*Exemplo 5-1=4(última posição do vetor)
 * @author Positivo
 *
 */

package br.geekuniversity.secao07;

public class Programa16 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Declarando um vetor sem especificar o tamanho/posições
		int vetor[];

		// Declaração de um vetor com as quantidade de posições
		int numeros[] = new int[5];
		float valores[] = new float[5];
		char caracteres[] = new char[20];
		String nomes[] = new String[4];

		// Declarar e inicializar
		int outros_numeros[] = { 1, 3, 5, 7, 9 };// Tamanho do vetor é 5, última posição 5-1=4
		String frutas[] = { "Manga", "Uva", "Banana" };// O vetor é de tamanho 3, última posição 2

	}

}
