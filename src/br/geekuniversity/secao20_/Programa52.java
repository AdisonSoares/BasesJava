/*Threads - Criando e trabalhando
 *� uma execu��o em paralelo, � bem utilizado para processos demorados. 
 *Simula��o com execu��o de threads.*/

package br.geekuniversity.secao20_;
public class Programa52 {
	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread thrdBarra = new Thread(barra);
		thrdBarra.start();
		
		GerarRelatorio relatorio = new GerarRelatorio();
		Thread thrdRelatorio = new Thread(relatorio);
		thrdRelatorio.start();
		
	}
}
