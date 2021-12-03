/*Caixa de objetos gen�ricos*/

package br.geekuniversity.secao18;
public class Caixa {
	
	/**
	 * Esse vetor vai guardar a contas, como um banco de dados da mem�ria ram
	 */
	private Object[] objeto;
	private int posicaoLivre;
	
	/**
	 * O instanciador caixa vai inicializar o vetor de armazenamento das contas
	 */
	public Caixa() {
		//Limite at� 100 objetos, de 0 at� 99
		objeto = new Object[100];
		posicaoLivre = 0;
	}
	
	/**
	 * M�todo para armazenar os dados da conta e adicionar uma contagem
	 * para a pr�xima, � do do tipo object para aproveitar toda a classe conta.
	 * @param nova conta
	 */
	public void adicionar(Object nova) {
		this.objeto[this.posicaoLivre] = nova;
		this.posicaoLivre++;
	}
	
	/**
	 * M�todo que retorna os dados da conta
	 * @param posicao do vetor
	 * @return valor armazenado na posicao
	 */
	public Object pegar(int posicao) {
		/*Existe um problema no getSaldo do programa
		 *pois retorna um object e na classe objeto n�o existe getSaldo*/
		return this.objeto[posicao];
	}
	
}
