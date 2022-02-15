/*Documentação por Javadoc:*/
/**
 * Tipo de dados
 * Numericos(Inteiro e Reais)
 * @author Positivo
 *
 */

package br.geekuniversity.secao06_;
public class Programa12 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Tipos primários ou Primitivos
		//Por padrão os numeros reais em Java são considerados double
		//Cada tipo primario tem uma classe que o representa
		//Ocupa menos memória - mais rápido
		float num1=23.4f;// Precisa colocar o "f" no final
		double num2=23.4;// Não precisa colocar o "f" no final
				
		//Tipos não primários ou Não Primitivos
		//São classes que representam os primários
		//Ocupa mais memória
		//Usa-se para realizar conversão
		Float num3=23.4f;
		Double num4=23.4;
	}

}
