/*Threads - Criando e trabalhando
 *É uma execução em paralelo, é bem utilizado para processos demorados. 
 *Simulação com execução de threads.*/

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
