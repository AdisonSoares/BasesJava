package br.geekuniversity.secao09;
/*Construtores ou M�todos Construtores

 O construtor da classe sempre tem o mesmo nome da classe.
 Pode haver mais de um construtor na classe.
 Por padr�o, a JVM - Java Virtual Machine cria, em tempo de constru��o, um
 construtor vazio(sem par�metros) padr�o.
 No momento em que se cria um construtor com par�metros n�o se pode deixar vazio
 o construtor ao instanciar no programa principal, a menos que se fa�a um construtor
 com parametros e outro sem, ou seja, que se tenha dois m�todos construtores.*/

public class Programa23 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Riverino Silva";
		pessoa1.email = "rive@gmail.com";
		pessoa1.ano_nascimento = 1997;
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.email);
		System.out.println(pessoa1.ano_nascimento);
		System.out.println();
		
		Pessoa pessoa2 = new Pessoa("Josivaldo Santos","josi@gmail.com",1980);
		
		pessoa2.imprimeInformacoes();
		
	}

}
