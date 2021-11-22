package br.geekuniversity.secao12;

public class Professor extends Pessoa{
	private String matricula;
	
	//Método construtor
	public Professor(String nome, int ano_nascimento, String email, String matricula) {
		super(nome, ano_nascimento,email);
		this.matricula = matricula;
	}
	public Professor() {}
	
	//Métodos Get e Set
	public String getMatricula() {
		return this.matricula;
	}
	public void getMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	//Polimorfismo do método toString
	public String toString() {
		return super.toString()+"\nMatricula: "+this.matricula;
	}

	//Método Get com polimorfismo
		public String getNome() {
			return "GetNome Professor:"+super.getNome();
	}
	@Override//Sobrescrita
	public void outra_mensagem(String texto) {
		System.out.println(texto);
			
	}
}
