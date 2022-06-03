/*Tratando exceções com Try Catch e finally*/

package br.geekuniversity.secao16;
public class Programa36 {

	public static void main(String[] args) {
		int numeros [] = new int [5];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i+3*2;
		}
		for (int i = 0; i <= numeros.length; i++) {
			try {
				System.out.println(numeros[i]);
			}catch(java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println("Não é possível acessar a informaçao");
			}finally {
				System.out.println("Finally executado.....");
			}	
		}				
	}
}
