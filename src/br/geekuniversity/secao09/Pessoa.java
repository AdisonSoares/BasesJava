/*Documenta��o por Javadoc:*/
/**
 * Classes, Atributos e M�todos
 * @author Positivo
 *
 */

/*Atributos s�o caracteristicas da classe/modelo/modelo de dados.
  Podemos entender atributos como vari�veis da classe.
  Outra forma de nomear os atributos � chamando-os de estados.
  Atributos s�o nomeados em letras min�sculas, sem espa�o, sem 
  caracteres especiais, sem acentua��o.
  O nome de uma vari�vel pode ser iniciada apenas com letras e underline.
  Podemos entender os m�todos como a a��o que � realizada por um objeto da classe.
  Os m�todos s�o comportamentos dos objetos da classe.
  Os par�metros s�o os atributos discriminados na classe.
  O this fala do pr�prio objeto da classe.*/

package br.geekuniversity.secao09;
public class Pessoa {
	
	String nome,email;
	int ano_nascimento;
	
	//Construtor padr�o/vazio
	public Pessoa() {}
	
	//Construtor com par�metros
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}
	/**
	 * M�todo exibi��o
	 */
	void imprimeInformacoes() {
		System.out.println(this.nome);
		System.out.println(this.email);
		System.out.println(this.ano_nascimento);
		System.out.println();
	}
	
}
