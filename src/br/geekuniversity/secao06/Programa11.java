/*Documenta��o por Javadoc:*/
/**
 * Tipo de dados
 * Numericos(Inteiro e Reais)
 * @author Positivo
 *
 */

package br.geekuniversity.secao06;

public class Programa11 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Tipos prim�rios ou Primitivos
		//S�o comuns, b�sicos
		//Cada tipo primario tem uma classe que o representa
		//Ocupa menos mem�ria - mais r�pido
		
		long num0=4;// Inteiro maior
		int num1=4;// Inteiro
		short num2=4;// Inteiro(menor,curto,baixo)
		byte num3=4;//Inteiro menor que short
		char num8=34;//Mostra o correspondente do n�34 da tabela ask
		
		//Tipos n�o prim�rios ou N�o Primitivos
		//S�o classes que representam os prim�rios
		//Usa-se para realizar convers�o
		
		Long num7=(long)58;//Procedimento "Cast" para aceitar o valor como long
		Integer num4=98;
		Short num5=7;
		Byte num6=40;
		Character num9=35;//Mostra o correspondente do n�35 da tabela ask
		
		//Quanto uma vari�vel ocupa em mem�ria de bites
		System.out.println("long/Long ocupa"+Long.SIZE+" bits na mem�ria");
		System.out.println("int/Integer ocupa"+Integer.SIZE+" bits na mem�ria");
		System.out.println("short/Short ocupa"+Short.SIZE+" bits na mem�ria");
		System.out.println("byte/Byte ocupa"+Byte.SIZE+" bits na mem�ria");
		System.out.println();
		
		//Quantidade m�xima e m�nima que podem armazenar de bites
		System.out.println("Valor min long/Long "+Long.MIN_VALUE);
		System.out.println("Valor max long/Long "+Long.MAX_VALUE);
		
		System.out.println("Valor min int/Integer "+Integer.MIN_VALUE);
		System.out.println("Valor max int/Integer "+Integer.MAX_VALUE);
		
		System.out.println("Valor min short/Short "+Short.MIN_VALUE);
		System.out.println("Valor max short/Short "+Short.MAX_VALUE);
		
		System.out.println("Valor min byte/Byte "+Byte.MIN_VALUE);
		System.out.println("Valor max byte/Byte "+Byte.MAX_VALUE);
		
		System.out.println("Valor min byte/Byte "+Byte.MIN_VALUE);
		System.out.println("Valor max byte/Byte "+Byte.MAX_VALUE);
		
		
		
		
	}

}
