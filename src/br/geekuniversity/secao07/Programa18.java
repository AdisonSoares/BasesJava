/*Documentação por Javadoc:*/
/**
 * Matriz parte 1
 * @author Positivo
 *
 */

//Vetores/arrays/matrizer multidi-mensionais

/* Vetor // linhas
 * int vetor[3];
 * vetor[0]=3;
 * vetor[1]=2;
 * vetor[2]=3;
 * 
 * Matriz
 * [linhas][colunas]
 * int matriz[3][3];// 3 linhas e 3 colunas
 * 
 * matriz[0][0]=1;
 * matriz[0][1]=8;
 * matriz[0][2]=2;
 * matriz[1][0]=7;
 * matriz[1][1]=5;
 * matriz[1][2]=6;
 * matriz[2][0]=3;
 * matriz[2][1]=4;
 * matriz[2][2]=9;
 * 
 */
package br.geekuniversity.secao07;
public class Programa18 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Declaração e definição de tamanho
		int matriz[][] = new int[3][3];
		
		//Declaração apenas
		int matriz2[][];
		
		//Declarar, definir o tamanho e inicializar
		//matriz[3][3]
		//Três linhas e três colunas
		int matriz3[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Declarando uma matriz informando apenas as linhas
		//Posteriormente se inicializa as colunas
		//No exemplo
		int matriz4[][] = new int[2][];
		matriz4[0] = new int[5];//Na linha 0 colocar um array de 5 elementos
		matriz4[1] = new int[3];//Na linha 1 colocar um array de 3 elementos
		
		//Colocando valores na matriz de acordo com o exemplo anterior
		int matriz5[][]= {{4,5,6,7,8},{9,10,11}};// Duas linhas, 5 elementos em uma e 3 em outra
	}
}





















