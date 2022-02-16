/*Documentação por Javadoc:*/
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
		
		//Tipos não primitivos
		Boolean v=true;
		Boolean f=false;
		
		System.out.println("Verdadeiro "+verdadeiro);
		System.out.println("Falso "+falso);
		System.out.println("V "+v);
		System.out.println("F "+f);
		
		//OBS - Não existe um tamanho pois só existem dois valores, verdadeiro ou falso
		//Usa-se o boleanos para funções
		
		//Exemplos de funções
		if(verdadeiro) {
			System.out.println("É verdadeiro");
		}else {
			System.out.println("É falso");
		}
		//-----------------------------//
		/*if(1==1) {
			System.out.println("É verdadeiro");
		}else {
			System.out.println("É falso");
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
