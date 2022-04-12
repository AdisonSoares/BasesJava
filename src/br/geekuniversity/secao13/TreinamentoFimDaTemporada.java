/*Os métodos da classe abstrata são obrigatorios para as classes filhas.*/

package br.geekuniversity.secao13;

import br.geekuniversity.secao13.Treinamento;

@SuppressWarnings("unused")
public class TreinamentoFimDaTemporada extends Treinamento{
	
	//Métodos da classe abstrata, sobrescrita/override.
	@Override
	public void preparoFisico() {
		System.out.println("Preparo físico de fim da temporada");
	}
	@Override
	public void jogoTreino() {
		System.out.println("Jogo treino de fim da temporada");
	}

}
