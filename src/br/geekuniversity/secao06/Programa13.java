/*Documentação por Javadoc:*/
/**
 * Tipos de dados alfanumericos
 * Caracteres e Strings
 * OBS - Strings não possuem ocupação fixa de memória pois
 * são um tipo de alocação em vetor de memória
 * @author Positivo
 *
 */

package br.geekuniversity.secao06;
public class Programa13 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Tipos primitivos
		char letra1 = 'a';//Armazena a letra, representado por aspas simples
		char letra2 = 97;//Armazena um código da tabela ask
		
		System.out.println("letra "+letra1);//Retorna a letra armazenada
		System.out.println("letra "+letra2);//Retorna o codigo correspondente a 97 da tab ask
		
		letra2=(char)(letra2+1);// Uso do cast para dizer que tudo é do tipo char
		
		System.out.println("letra "+letra2);//Retorna o codigo correspondente a 98 da tab ask
		
		
		//Tipos não primitivos
		Character letra3='A';//Armazena a letra, representado por aspas simples
		String nome="Joanino";//Aspas duplas é String, não existe tipo primitivo
		
		System.out.println("letra "+letra3);//Retorna a letra armazenada
		System.out.println("char/Character ocupa "+Character.SIZE+" bits na memória");//Ocupação em memória
	}
}






