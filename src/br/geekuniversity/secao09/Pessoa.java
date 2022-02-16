/*Documentação por Javadoc:*/
/**
 * Classes, Atributos e Métodos
 * @author Positivo
 *
 */

/*Atributos são caracteristicas da classe/modelo/modelo de dados.
  Podemos entender atributos como variáveis da classe.
  Outra forma de nomear os atributos é chamando-os de estados.
  Atributos são nomeados em letras minúsculas, sem espaço, sem 
  caracteres especiais, sem acentuação.
  O nome de uma variável pode ser iniciada apenas com letras e underline.
  Podemos entender os métodos como a ação que é realizada por um objeto da classe.
  Os métodos são comportamentos dos objetos da classe.
  Os parâmetros são os atributos discriminados na classe.
  O this fala do próprio objeto da classe.*/

package br.geekuniversity.secao09;
public class Pessoa {
	
	String nome,email;
	int ano_nascimento;
	
	//Construtor padrão/vazio
	public Pessoa() {}
	
	//Construtor com parâmetros
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}
	/**
	 * Método exibição
	 */
	void imprimeInformacoes() {
		System.out.println(this.nome);
		System.out.println(this.email);
		System.out.println(this.ano_nascimento);
		System.out.println();
	}
	
}
