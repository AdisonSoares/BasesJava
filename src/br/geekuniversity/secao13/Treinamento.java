//Template Method
/*Consiste em separa um método principal e dividi-lo
**por partes ou subcomandos.
**OBS - O "final" é um modificador de acesso, o elemento que o usa
**não pode ser extendido/reescrito, ele deixa o método ou variável sem
**possibilidade de modificação por outras classes.*/

package br.geekuniversity.secao13;
public abstract class Treinamento {
	
	//Template Method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	//Métodos abstratos
	public abstract void preparoFisico();
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino tático...");
	}
}
