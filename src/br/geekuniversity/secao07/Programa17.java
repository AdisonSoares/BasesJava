/*Documentação por Javadoc:*/
/**
 * Vetores parte 2
 * OBS - O length exibe o tamanho da variável atribuída antes do ponto
 * Para comentar uma linha ou todas as linhas basta selecionar com o mouse e aperta ctrl+barra
 */
package br.geekuniversity.secao07;
public class Programa17 {
	public static void main(String[] args) {
		//Declaração e definição de tamanho do vetor
		int numeros[] = new int [10];
		
		System.out.println("Tamanho do vetor "+numeros.length);
		
		for(int i = 0; i<numeros.length;i++) {
			numeros[i]=i+3;
		}
	
		System.out.println(numeros[0]);//Primeiro elemento
		System.out.println(numeros[9]);//Último elemento
		
		//Acrescentar valores randômicos
		//Função round recebe double e converte(arredonda) para int
		//Ao gerar os números aleatórios(randômicos) ele é multiplicado por 10
		for(int i = 0; i<numeros.length; i++) {
			numeros[i]=(int)Math.round(Math.random()*10);
		}
		
		System.out.println(numeros[0]);//Primeiro elemento
		System.out.println(numeros[9]);//Último elemento
		
		//A função random retorna um nº fracional entre 0 e 1
		System.out.println(Math.random());
		
		//Foreatch
		//Para cada inteiro dentro de que chamo de i dentro de numeros
		//Imprima i
		//Não tem condições de parada, ao contrario do laço for
		//Vai mostrar até o limite do vetor
		for (int i : numeros) {
			System.out.println(i);
		}
	}
}
