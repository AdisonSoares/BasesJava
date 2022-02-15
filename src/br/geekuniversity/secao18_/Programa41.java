/*Trabalhando com Strings,
 *Strings s�o imut�veis, caso haja mudan�a � 
 *preciso fazer uma nova vari�vel para receber.
 *String � um array de caracteres.*/

package br.geekuniversity.secao18_;
public class Programa41 {
	public static void main(String[] args) {
		String mensagem01 = "Programa��o em java\n";
		System.out.println(mensagem01);
		
		/*M�todo de edi��o - troca*/
		String mensagem02 = mensagem01.replace("java","python");
		System.out.println(mensagem02);
		
		/*M�todo de edi��o - maiusculo*/
		String mensagem03=mensagem01.toUpperCase();
		System.out.println(mensagem03);
		
		/*M�todo de edi��o - minusculo*/
		String mensagem04=mensagem01.toLowerCase();
		System.out.println(mensagem04);
		
		/*Manipula��o do array Strig de acordo com a posi��o*/
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



















