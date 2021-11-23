/*Documenta��o por Javadoc:*/
/**
 * Cria��o de objetos e Construtor
 * @author Positivo
 *
 */

/*Objetos s�o produtos/instancias da classe, a partir de uma classe
  � criado um objeto.
  Para se criar um objeto primeiro inicia com o tipo do objeto depois o nome
  que se quer deixar para esse objeto depois declara que � um novo tipo de objeto.
  No momento em que um objeto � declarado e inicializado/instanciado o programa separa
  um local da mem�ria para guardar a informa��o.
  Caso um objeto seja apenas declarado n�o existe a aloca��o de mom�ria.
  No exemplo abaixo o p0 � a inst�ncia do objeto ou objeto,ou seja,
  o p0 � uma instancia/objeto da classe Produto.
  OBS - Quando se coloca um valor com ponto em uma vari�vel de tipo flutuante precisa
  colocar f no final no n�mero, caso n�o tenha ponto ele converte autom�tico para float.
  Construtor � um m�todo especial que constroe o objeto/inst�ncia.
  Por ser um m�todo tamb�m pode ser chamado de M�todo Construtor.
  O construtor da classe sempre tem o mesmo nome da classe.
  Pode haver mais de um construtor na classe.
  Por padr�o, a JVM - Java Virtual Machine cria, em tempo de constru��o, um
  construtor vazio(sem par�metros) padr�o.*/

package br.geekuniversity.secao09;
public class Programa22 {
	public static void main(String[] args) {

		// Declarando um objeto apenas
		Produto p0;

		// Inicializando o objeto
		p0 = new Produto();// O Protudo(); � o construtor

		// Declarando e instanciando/inicializando o objeto
		Produto p1 = new Produto();// O Protudo(); � o construtor
		
		p1.nome = "Notebook";
		p1.preco = 2.780f;
		p1.desconto = 15.0f;
		
		System.out.println("----------PRODUTOS-------------");
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p1.desconto);
		System.out.println();
		
		p0.nome="Caneta Bic";
		p0.preco=1.00f;
		p0.desconto=5;
		
		System.out.println("----------PRODUTOS-------------");
		System.out.println(p0.nome);
		System.out.println(p0.preco);
		System.out.println(p0.desconto);
		System.out.println();
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome="Joanino";
		pessoa1.ano_nascimento=1990;
		pessoa1.email="joanino@gmail.com";
		
		System.out.println("----------PESSOA-------------");
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.ano_nascimento);
		System.out.println(pessoa1.email);
		System.out.println();
		
		
		
	}
}
