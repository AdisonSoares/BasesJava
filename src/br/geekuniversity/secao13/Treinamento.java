//Template Method
/*Consiste em separa um m�todo principal e dividi-lo
**por partes ou subcomandos.
**OBS - O "final" � um modificador de acesso, o elemento que o usa
**n�o pode ser extendido/reescrito, ele deixa o m�todo ou vari�vel sem
**possibilidade de modifica��o por outras classes.*/

package br.geekuniversity.secao13;
public abstract class Treinamento {
	
	//Template Method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	//M�todos abstratos
	public abstract void preparoFisico();
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino t�tico...");
	}
}
