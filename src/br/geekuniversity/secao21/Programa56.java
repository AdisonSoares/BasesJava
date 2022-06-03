package br.geekuniversity.secao21;

public class Programa56 {
	public static void main(String[] args) {
		Vetor lista = new Vetor();
		
		for (int i = 0; i < 300; i++) {
			Aluno a = new Aluno("Luiza "+i);
			lista.addAluno(a);
		}
		System.out.println(lista+"\n");
		
		System.out.println("Quantidade de alunos: "+lista.qtdeAlunos()+"\n");
	}
}

/*Limite aumentado
* 2 * 100 = 200
* 2 * 200 = 400*/
