/*Documentação por Javadoc:*/
/**
 * Operações matematicas
 */
package br.geekuniversity.secao06;
public class Programa15 {
	public static void main(String[] args) {
		int num1=5, num2=9;
		int res1;
		float res2;
		
		//Soma
		res1=num1+num2;
		System.out.println("A soma de"+num1+"+ "+num2+"= "+res1);
		
		//Subtração
		res1=num1-num2;
		System.out.println("A subtração de"+num1+"- "+num2+"= "+res1);
		
		//Multiplicação
		res1=num1*num2;
		System.out.println("A multiplicação de"+num1+"x "+num2+"= "+res1);
		
		//Divisão
		//Inteira
		res1=num1/num2;
		System.out.println("A divisão de"+num1+"/ "+num2+"= "+res1);
		
		//Divisão
		//Real
		res2=num1/num2;
		System.out.println("A divisão de"+num1+"/ "+num2+"= "+res2);
		
		//Divisão
		//Real
		res2=(float)num1/(float)num2;//Cast - considere num1 e num2 como float
		System.out.println("A divisão de"+num1+"/ "+num2+"= "+res2);
		
		//Módulo
		res1=num1%2;//Resto da divisão de num1 por 2,, se for 0 é par se for 1 é ímpar
		System.out.println("O resto da divisão de"+num1+"por 2 = "+res1);
		
		//-----------------------//
		res1=num1%3;//Saber se num1 é divisivel por 3, se for 0 é se for 1 não é
		System.out.println("O resto da divisão de"+num1+"por 2 = "+res1); 		
	}
}
