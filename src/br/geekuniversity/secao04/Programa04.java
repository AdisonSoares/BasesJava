/*Documentação por Javadoc:*/
/**
 * if, else, if else
 */
package br.geekuniversity.secao04;
public class Programa04 {
	public static void main(String[] args) {
		int numero=5;
	
		if(numero>5) {
			System.out.println("Sim, o número"+numero+" é maior que 5");
		}else if(numero==5) {
			System.out.println("O número"+numero+" é igual a 5");
	  	}else {
			System.out.println("Não, o número"+numero+" não é maior que 5");
		}
	}
}
