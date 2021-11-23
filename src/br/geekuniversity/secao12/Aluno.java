package br.geekuniversity.secao12;

public class Aluno extends Pessoa{
	private String registroAcademico;
	
	//Método construtor
	public Aluno(String nome, int ano_nascimento,String email, String registroAcademico) {
		super(nome, ano_nascimento, email);
		this.registroAcademico = registroAcademico;
	}
	public Aluno() {}
	
	//Métodos Get e Set
	public String getRegistroAcademico() {
		return this.registroAcademico;
	}
	public void setRegistroAcademico(String registroAcademico) {
		this.registroAcademico = registroAcademico;
	}
	
	/**
	 * Polimorfismo do método toString
	 */
	public String toString() {
		return super.toString()+"\nRegistro Acadêmico: "+ this.registroAcademico;
	}
	
	@Override
	/**
	 * Sobrescrita
	 */
	public void outra_mensagem(String texto) {
		System.out.println(texto);
		
	}
	
}
