
//Herança
package br.geekuniversity.secao12;

import br.geekuniversity.secao12.Aluno;
import br.geekuniversity.secao12.Professor;

@SuppressWarnings("unused")
public class Programa28 {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Mauricio Rabelo",1991,"mauri@gmail.com","032580");
		Professor professor = new Professor("Wesley Tadeu",1950,"weslei@gmail.com","0145390");
		
		System.out.println("Aluno:");
		System.out.println(aluno.getNome());
		System.out.println(aluno.getAnoNascimento());
		System.out.println(aluno.getEmail());
		System.out.println(aluno.getRegistroAcademico());
		System.out.println();
		
		System.out.println("Uso do método toString com polimorfismo");
		System.out.println(aluno.toString());
		System.out.println();
		
		System.out.println("Professor:");
		System.out.println(professor.getNome());
		System.out.println(professor.getAnoNascimento());
		System.out.println(professor.getEmail());
		System.out.println(professor.getMatricula());
		System.out.println();
		
		System.out.println("Uso do método toString com polimorfismo");
		System.out.println(professor.toString());
		System.out.println();

	}

}
