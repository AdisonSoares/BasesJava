package br.geekuniversity.secao20;

public class GerarRelatorio implements Runnable{
	public void executa() {
		/*La�o for de 0 at� 1 mil*/
		for (int i = 0; i < 1000; i++) {
			System.out.println(i+": Relatorio em andamento.....aguarde");
		}
	}
	/*Depois de importar a interface runnable, para implementar a fun��o no programa com a 
	 *thread*/	
	@Override
	public void run() {
		/* La�o for de 0 at� 1 mil */
		for (int i = 0; i < 1000; i++) {
			System.out.println(i+": Relatorio em andamento.....aguarde");
		}
	}
}
