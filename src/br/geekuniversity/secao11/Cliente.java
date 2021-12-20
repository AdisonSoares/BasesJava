/*Documentação por Javadoc:*/
/**
 * Se não é colocado um modificador de acesso em um método ou atributo ele recebe
 * por padrão o modificador protected.
 * @author Positivo
 *
 */

/*O modificador Protected(protegido) permite que o elemento seja visivel somente
  no pacote onde o mesmo foi declarado, mesmo sendo o mesmo projeto.
  Ao acessar um elemento protected não é preciso método get ou set, nesse caso 
  o acesso é como um elemento public dentro do pacote.*/

package br.geekuniversity.secao11;
@SuppressWarnings("rawtypes")
public class Cliente implements Comparable{
	private String nome, endereco;
	private int idade;

	public Cliente(int idade, String nome, String endereco) {
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
		//this.dizer_oi();
	}

	/*
	private void dizer_oi() {
		System.out.println(this.nome+" está dizendo olá");
	}
	*/
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	@Override
	public String toString() {
		return this.nome +" " +this.endereco;
	}

	@Override
	public int compareTo(Object outro) {
		Cliente aux = (Cliente)outro;
		if(this.idade<aux.idade) {
			return -1;
		}else if(this.idade>aux.idade) {
			return 1;
		}else {
			return 0;
		}
	}
}










