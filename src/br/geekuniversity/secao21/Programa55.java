package br.geekuniversity.secao21;

/**
 * @Armazenamento_Sequencial Na prática uma revisão de vetores e matrizes.
 * 
 * @Vetor_Zerado Case se tenha um vetor ou matriz do tipo numerico e não se
 *               armazenam valores automaticamente o programa irá preencher com
 *               zero.
 * 
 * @Vetor_Null Quando um vetor ou matriz do tipo objeto é construido e não se
 *             armazenam valores automaticamente é colocado null.
 * 
 */
public class Programa55 {

	public static void main(String[] args) {

		// Implementando a classe Aluno com a classe Vetor
		Aluno aluno1 = new Aluno("Valdo-0");
		Aluno aluno2 = new Aluno("Antonia-1");

		// Objeto da classe Vetor
		Vetor lista = new Vetor();

		// Exibir total de alunos
		System.out.println("Total de alunos: " + lista.qtdeAlunos() + "\n");

		// Adicionando alunos ao objeto Vetor
		lista.addAluno(aluno1);
		
		// Exibir total de alunos
		System.out.println("Total de alunos: " + lista.qtdeAlunos() + "\n");
		
		// Adicionando alunos ao objeto Vetor
		lista.addAluno(aluno2);
		
		// Exibir total de alunos
		System.out.println("Total de alunos: " + lista.qtdeAlunos() + "\n");
				
		// Exibindo a lista
		System.out.println(lista.toString() + "\n");

		// Verificar se existem alunos cadastrados
		System.out.println("Existem alunos?: " + lista.alunoExiste(aluno2) + "\n");

		// Exibir total de alunos
		System.out.println("Total de alunos: " + lista.qtdeAlunos() + "\n");
		
		//Exibir a posicao do aluno
		System.out.println("Aluno da posição 0 é : "+lista.posicaoAluno(0));
		System.out.println("Aluno da posição 1 é : "+lista.posicaoAluno(1)+ "\n");
		
		//Exibir a posicao do aluno - Tratamento de erro
		try {System.out.println("Aluno da posição 1 é : "+lista.posicaoAluno(101));
			
		} catch (IllegalArgumentException e) {
			System.out.println("Aluno na posição 101 não existe!");
			System.out.println(e.getMessage()+"\n");
		}
		
		//Testando a entrada de um aluno no meio da lista preenchida
		
		System.out.println("ADICIONANDO ALUNOS\n");
		Aluno aluno3 = new Aluno("Estevão-2");
		Aluno aluno4 = new Aluno("Roberta-3");
		Aluno aluno5 = new Aluno("Hugo-4");
		Aluno aluno6 = new Aluno("Vanessa-5");
		
		// Adicionando alunos ao objeto Vetor
		lista.addAluno(aluno3);
		lista.addAluno(aluno4);
		lista.addAluno(aluno5);
		lista.addAluno(aluno6);
		
		// Exibir total de alunos
		System.out.println("Total de alunos: " + lista.qtdeAlunos() + "\n");
		// Exibindo a lista
		System.out.println(lista.toString() + "\n");
		
		/*****************************************************************************/
		
		System.out.println("Testando a entrada de um aluno no meio da lista preenchida");
		
		System.out.println("ADICIONANDO ALUNOS\n");
		Aluno aluno7 = new Aluno("Igor-2");
		
		// Adicionando alunos ao objeto Vetor
		lista.addAluno(aluno7,2);
		
		// Exibir total de alunos
		System.out.println("Total de alunos: " + lista.qtdeAlunos() + "\n");
		// Exibindo a lista
		System.out.println(lista.toString() + "\n");
		
		/*****************************************************************************/	
		
		System.out.println("ADICIONANDO ALUNOS\n");
		Aluno aluno8 = new Aluno("Valeria-102");
		
		// Adicionando alunos ao objeto Vetor
		try {lista.addAluno(aluno8,102);
			
		} catch (IllegalArgumentException e) {
			System.out.println("Aluno na posição 102 não existe!");
			System.out.println(e.getMessage()+"\n");
		}
		
		
		// Exibir total de alunos
		System.out.println("Total de alunos: " + lista.qtdeAlunos() + "\n");
		// Exibindo a lista
		System.out.println(lista.toString() + "\n");
		
		/*****************************************************************************/	
		
		System.out.println("UTILIZANDO OS OUTROS MÉTODOS");
		
		//Remover aluno
		lista.remAluno(3);
		
		// Exibindo a lista
		System.out.println(lista.toString() + "\n");
		// Exibir total de alunos
		System.out.println("Total de alunos: " + lista.qtdeAlunos() + "\n");
		

		
		
		
	}
}
