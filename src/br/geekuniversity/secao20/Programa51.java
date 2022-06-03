/*Threads - Criando e trabalhando
 *É uma execução em paralelo, é utilizado para processos demorados. 
 *Simulação sem execução de threads.*/

package br.geekuniversity.secao20;
public class Programa51 {
	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa();
		
		GerarRelatorio relatorio = new GerarRelatorio();
		relatorio.executa();
	}
}
