/*Documenta��o por Javadoc:*/
/**
 * Opera��es matematicas
 * @author Positivo
 *
 */

package br.geekuniversity.secao06_;
public class Programa15 {
	public static void main(String[] args) {
		int num1=5, num2=9;
		int res1;
		float res2;
		
		//Soma
		res1=num1+num2;
		System.out.println("A soma de"+num1+"+ "+num2+"= "+res1);
		
		//Subtra��o
		res1=num1-num2;
		System.out.println("A subtra��o de"+num1+"- "+num2+"= "+res1);
		
		//Multiplica��o
		res1=num1*num2;
		System.out.println("A multiplica��o de"+num1+"x "+num2+"= "+res1);
		
		//Divis�o
		//Inteira
		res1=num1/num2;
		System.out.println("A divis�o de"+num1+"/ "+num2+"= "+res1);
		
		//Divis�o
		//Real
		res2=num1/num2;
		System.out.println("A divis�o de"+num1+"/ "+num2+"= "+res2);
		
		//Divis�o
		//Real
		res2=(float)num1/(float)num2;//Cast - considere num1 e num2 como float
		System.out.println("A divis�o de"+num1+"/ "+num2+"= "+res2);
		
		//M�dulo
		res1=num1%2;//Resto da divis�o de num1 por 2,, se for 0 � par se for 1 � �mpar
		System.out.println("O resto da divis�o de"+num1+"por 2 = "+res1);
		
		//-----------------------//
		res1=num1%3;//Saber se num1 � divisivel por 3, se for 0 � se for 1 n�o �
		System.out.println("O resto da divis�o de"+num1+"por 2 = "+res1); 		
	}
}
