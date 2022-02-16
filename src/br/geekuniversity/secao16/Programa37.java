/*Tratando exceções com Try Catch e finally*/

package br.geekuniversity.secao16;
import java.util.Scanner;
public class Programa37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero para divisão:");
		int num1 = sc.nextInt();
		
		System.out.print("Numero para divisão:");
		int num2 = sc.nextInt();
		try {
			System.out.println("Divisão dos dois numeros = "+num1/num2);
		} catch (java.lang.ArithmeticException e) {
			System.out.println("Não é possível fazer divisão por zero");
		}finally {
			System.out.println("Finally executado.....");
		}	
		
		sc.close();
	}

}
