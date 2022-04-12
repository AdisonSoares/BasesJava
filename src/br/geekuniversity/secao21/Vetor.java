package br.geekuniversity.secao21;

import java.util.Arrays;

public class Vetor {
	private Aluno alunos[];
	private int total = 0;

	public Vetor() {
		alunos = new Aluno[100];
	}

	public void addAluno(Aluno alunos) {
		this.aumentarLimite();
		this.alunos[this.total] = alunos;
		this.total++;
		/*
		 * ou
		 * 
		 * for (int i = 0; i < this.alunos.length; i++) { if (this.alunos[i] == null) {
		 * this.alunos[i] = alunos; break; } }
		 */
	} 
			

	
	/**
	 * @Sobrecarga de metodo com assinatura e implementacoes diferentes.
	 * 
	 * @Avanco_de_posicao
	 * O laco for eh usado para adiantar uma posicao
	 * do que esta armazenado no vetor de alunos, para poder
	 * acrescentar um novo aluno e ter espaco, n�o precisando
	 * de uma variavel auxiliar para armazenar o valor anterior.
	 * 
	 * @param alunos e posicao.
	 *
	 */
	public void addAluno(Aluno alunos, int posicao) {
		this.aumentarLimite();
		if (!limiteExcedido(posicao)) {
			throw new IllegalArgumentException("Posicao n�o existe, est� fora do limite!!");
		}
		for (int i = this.total - 1; i >= posicao; i--) {
			this.alunos[i + 1] = this.alunos[i]; 
		}
		this.alunos[posicao] = alunos;
		this.total++;
		
		}
	/**
	 * @Ajuste_de_posicao
	 * Ao tirar um cadastro de uma posicao
	 * eh necessario que os outros valores ocupem
	 * o espaco deixa no vetor de alunos.
	 * 
	 * @Substitui�ao_de_posicao
	 * Em vez de deletar o dado na posicao selecionada
	 * eh feita uma sobreposicao e o java entende que
	 * o arquivo sobreposto eh deletado ficando o arquivo
	 * anterior no lugar.
	 */
	public void remAluno(int posicao) {
		for (int i = posicao; i < this.total; i++) {
			this.alunos[i]=this.alunos[i+1];
		}
		this.total--;
	}

	public Aluno posicaoAluno(int posicao) {
		if (!limiteExcedido(posicao)) {
			throw new IllegalArgumentException("Posicao nao existe, esta fora do limite!!");
		}
		return this.alunos[posicao];
	}

	public boolean alunoExiste(Aluno alunos) {
		for (int i = 0; i < this.total; i++) {
			if (alunos.equals(this.alunos[i])) {
				return true;
			}
		}
		return false;
	}

	public int qtdeAlunos() {
		return this.total;
	}

	@Override
	public String toString() {
		return Arrays.toString(this.alunos);
	}

	/**
	 * @Funcao_auxiliar para fazer o controle da posicao de alunos. Caso a posicacao
	 * seja menor que o limite de posicoes do vetor vai retornar
	 * verdadeiro.
	 */
	private boolean limiteExcedido(int posicao) {
		return posicao >= 0 && posicao < this.total;
	}

	/**
	 * @M�todo_aumentar_limite_do_vetor_alunos
	 * Caso precise acrescentar alunos alem de 100 esse m�todo
	 * duplica o limite e salva os dados do vetor anterior.
	 */
	private void aumentarLimite() {
		if(total==alunos.length) {
			Aluno novoArray[] = new Aluno[alunos.length*2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos=novoArray;//Novo objeto arrayAlunos instanciado.
		}
	}

}
