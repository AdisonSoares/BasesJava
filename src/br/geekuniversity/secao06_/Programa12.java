/*Documenta��o por Javadoc:*/
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
		//Tipos prim�rios ou Primitivos
		//Por padr�o os numeros reais em Java s�o considerados double
		//Cada tipo primario tem uma classe que o representa
		//Ocupa menos mem�ria - mais r�pido
		float num1=23.4f;// Precisa colocar o "f" no final
		double num2=23.4;// N�o precisa colocar o "f" no final
				
		//Tipos n�o prim�rios ou N�o Primitivos
		//S�o classes que representam os prim�rios
		//Ocupa mais mem�ria
		//Usa-se para realizar convers�o
		Float num3=23.4f;
		Double num4=23.4;
	}

}
