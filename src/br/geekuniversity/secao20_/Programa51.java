/*Threads - Criando e trabalhando
 *� uma execu��o em paralelo, � bem utilizado para processos demorados. 
 *Simula��o sem execu��o de threads.*/

package br.geekuniversity.secao20_;
public class Programa51 {
	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa();
		
		GerarRelatorio relatorio = new GerarRelatorio();
		relatorio.executa();
	}

}
