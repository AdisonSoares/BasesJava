package br.geekuniversity.secao05;
//Foreach - Significa "para cada"
public class Programa10 {
	public static void main(String[] args) {
		String nome="Geek Univesity";
		
		//Para cada um dos caracteres da strig, imprima o caractere
		for (char letra : nome.toCharArray()) {
			System.out.print(letra);
			
		}
		
	}

}
