/*Documenta��o por Javadoc:*/
/**
 * Tipos boleanos
 * @author Positivo
 *
 */

package br.geekuniversity.secao06_;
public class Programa14 {

	public static void main(String[] args) {
		//Tipos primitivos
		boolean verdadeiro=true;
		boolean falso=false;
		
		//Tipos n�o primitivos
		Boolean v=true;
		Boolean f=false;
		
		System.out.println("Verdadeiro "+verdadeiro);
		System.out.println("Falso "+falso);
		System.out.println("V "+v);
		System.out.println("F "+f);
		
		//OBS - N�o existe um tamanho pois s� existem dois valores, verdadeiro ou falso
		//Usa-se o boleanos para fun��es
		
		//Exemplos de fun��es
		if(verdadeiro) {
			System.out.println("� verdadeiro");
		}else {
			System.out.println("� falso");
		}
		//-----------------------------//
		/*if(1==1) {
			System.out.println("� verdadeiro");
		}else {
			System.out.println("� falso");
		}
		*/
		//-----------------------------//
		boolean ativo=true;
		if(ativo) {
			System.out.println("Acesso permitido ao sistema");
		}else {
			System.out.println("Acesso negado ao sistema");
		}
		
	}

}
