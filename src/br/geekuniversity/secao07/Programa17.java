package br.geekuniversity.secao07;
//Vetores parte 2
public class Programa17 {
	public static void main(String[] args) {
		//Declara��o e defini��o de tamanho do vetor
		int numeros[] = new int [10];
		
		System.out.println("Tamanho do vetor "+numeros.length);
		
		for(int i = 0; i<numeros.length;i++) {
			numeros[i]=i+3;
		}
	
		System.out.println(numeros[0]);//Primeiro elemento
		System.out.println(numeros[9]);//�ltimo elemento
		
		//Acrescentar valores rand�micos
		//Fun��o round recebe double e converte(arredonda) para int
		//Ao gerar os n�meros aleat�rios(rand�micos) ele � multiplicado por 10
		for(int i = 0; i<numeros.length; i++) {
			numeros[i]=(int)Math.round(Math.random()*10);
		}
		
		System.out.println(numeros[0]);//Primeiro elemento
		System.out.println(numeros[9]);//�ltimo elemento
		
		//A fun��o random retorna um n� fracional entre 0 e 1
		System.out.println(Math.random());
		
		//Foreatch
		//Para cada inteiro dentro de que chamo de i dentro de numeros
		//Imprima i
		//N�o tem condi��es de parada, ao contrato do la�o for
		//Vai mostrar at� o limite do vetor
		for (int i : numeros) {
			System.out.println(i);
		}
	}

	//OBS - O length exibe o tamanho da vari�vel atribu�da antes do ponto
	//Para comentar uma linha ou todas as linhas basta selecionar com o mouse e aperta ctrl+barra
	
}
