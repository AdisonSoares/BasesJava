package br.geekuniversity.secao20;

public class GerarRelatorio implements Runnable{
	public void executa() {
		/*Laço for de 0 até 1 mil*/
		for (int i = 0; i < 1000; i++) {
			System.out.println(i+": Relatorio em andamento.....aguarde");
		}
	}
	/*Depois de importar a interface runnable, para implementar a função no programa com a 
	 *thread*/	
	@Override
	public void run() {
		/* Laço for de 0 até 1 mil */
		for (int i = 0; i < 1000; i++) {
			System.out.println(i+": Relatorio em andamento.....aguarde");
		}
	}
}
