/*Documentação por Javadoc:*/
/**
 * Criação de objetos e Construtor
 * @author Positivo
 *
 */

/*Objetos são produtos/instancias da classe, a partir de uma classe
  é criado um objeto.
  Para se criar um objeto primeiro inicia com o tipo do objeto depois o nome
  que se quer deixar para esse objeto depois declara que é um novo tipo de objeto.
  No momento em que um objeto é declarado e inicializado/instanciado o programa separa
  um local da memória para guardar a informação.
  Caso um objeto seja apenas declarado não existe a alocação de momória.
  No exemplo abaixo o p0 é a instância do objeto ou objeto,ou seja,
  o p0 é uma instancia/objeto da classe Produto.
  OBS - Quando se coloca um valor com ponto em uma variável de tipo flutuante precisa
  colocar f no final no número, caso não tenha ponto ele converte automático para float.
  Construtor é um método especial que constroe o objeto/instância.
  Por ser um método também pode ser chamado de Método Construtor.
  O construtor da classe sempre tem o mesmo nome da classe.
  Pode haver mais de um construtor na classe.
  Por padrão, a JVM - Java Virtual Machine cria, em tempo de construção, um
  construtor vazio(sem parâmetros) padrão.*/

package br.geekuniversity.secao09;
public class Programa22 {
	public static void main(String[] args) {

		// Declarando um objeto apenas
		Produto p0;

		// Inicializando o objeto
		p0 = new Produto();// O Protudo(); é o construtor

		// Declarando e instanciando/inicializando o objeto
		Produto p1 = new Produto();// O Protudo(); é o construtor
		
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
