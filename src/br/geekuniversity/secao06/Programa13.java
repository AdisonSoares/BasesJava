/*Documenta��o por Javadoc:*/
/**
 * Tipos de dados alfanumericos
 * Caracteres e Strings
 * OBS - Strings n�o possuem ocupa��o fixa de mem�ria pois
 * s�o um tipo de aloca��o em vetor de mem�ria
 * @author Positivo
 *
 */

package br.geekuniversity.secao06;
public class Programa13 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Tipos primitivos
		char letra1 = 'a';//Armazena a letra, representado por aspas simples
		char letra2 = 97;//Armazena um c�digo da tabela ask
		
		System.out.println("letra "+letra1);//Retorna a letra armazenada
		System.out.println("letra "+letra2);//Retorna o codigo correspondente a 97 da tab ask
		
		letra2=(char)(letra2+1);// Uso do cast para dizer que tudo � do tipo char
		
		System.out.println("letra "+letra2);//Retorna o codigo correspondente a 98 da tab ask
		
		
		//Tipos n�o primitivos
		Character letra3='A';//Armazena a letra, representado por aspas simples
		String nome="Joanino";//Aspas duplas � String, n�o existe tipo primitivo
		
		System.out.println("letra "+letra3);//Retorna a letra armazenada
		System.out.println("char/Character ocupa "+Character.SIZE+" bits na mem�ria");//Ocupa��o em mem�ria
	}
}






