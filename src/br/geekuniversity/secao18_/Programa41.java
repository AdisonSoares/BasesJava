/*Trabalhando com Strings,
 *Strings são imutáveis, caso haja mudança é 
 *preciso fazer uma nova variável para receber.
 *String é um array de caracteres.*/

package br.geekuniversity.secao18_;
public class Programa41 {
	public static void main(String[] args) {
		String mensagem01 = "Programação em java\n";
		System.out.println(mensagem01);
		
		/*Método de edição - troca*/
		String mensagem02 = mensagem01.replace("java","python");
		System.out.println(mensagem02);
		
		/*Método de edição - maiusculo*/
		String mensagem03=mensagem01.toUpperCase();
		System.out.println(mensagem03);
		
		/*Método de edição - minusculo*/
		String mensagem04=mensagem01.toLowerCase();
		System.out.println(mensagem04);
		
		/*Manipulação do array Strig de acordo com a posição*/
		System.out.println(mensagem01.charAt(0));
		
		/*Ordem normal*/
		for (int i = 0; i < mensagem01.length(); i++) {
			System.out.print(mensagem01.charAt(i));
		}	
		
		/*Ordem inversa*/
		for (int i = (mensagem01.length()-1); i >= 0; i--) {
			System.out.print(mensagem01.charAt(i));
		}		
	}
}



















