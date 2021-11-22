/*Se n�o � colocado um modificador de acesso em um m�todo ou atributo ele recebe
 * por padr�o o modificador protected.
 * O modificador Protected(protegido) permite que o elemento seja visivel somente
 * no pacote onde o mesmo foi declarado, mesmo sendo o mesmo projeto.
 * Ao acessar um elemento protected n�o � preciso m�todo get ou set, nesse caso 
 * o acesso � como um elemento public dentro do pacote.*/

package br.geekuniversity.secao11;
public class Cliente {
	private String nome, endereco;

	public Cliente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.dizer_oi();
	}

	private void dizer_oi() {
		System.out.println(this.nome+" est� dizendo Iiaaa��� ah ah ah");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
}
