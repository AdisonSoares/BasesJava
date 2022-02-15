/*Object - A mãe de todas as classes
 *Toda as classes por padrão herdam da classe Object,
 *por isso não aparece a extensão para Object.
 *A classe Object faz parte do pacote java.lang.*/

package br.geekuniversity.secao18_;
import br.geekuniversity.secao11_.Cliente;
import br.geekuniversity.secao11_.Conta;
public class Programa39 extends Object{
	public static void main(String[] args) {
		Cliente cli01 = new Cliente(42, "Josoaldo Silva", "SHVP, Ch 40, Lote 30");
		Cliente cli02 = new Cliente(27,"Filiano Rodrigues", "QNP 40, Lote 15, Casa 13");
		Caixa armConta = new Caixa();
		
		Conta cont01 = new Conta(1, 200, 300, cli01);
		Conta cont02 = new Conta(2, 200, 300, cli02);
		
		//Por padrão uma instancia imprime com toString
		System.out.println(cont01.toString());
		System.out.println(cont02.toString());
		System.out.println();
		
		/*----------------------------------------------*/
		if(cont01==cont02) {
			System.out.println("Contas semelhantes com ==");
		}else {
			System.out.println("Contas diferentes com ==");
		}
		System.out.println();
		
		//OU
		
		/*----------------------------------------------*/
		if(cont01.equals(cont02)) {
			System.out.println("Contas semelhantes  com equals");
		}else {
			System.out.println("Contas diferentes com equals");
		}
		System.out.println();
		
		/*----------------------------------------------*/
		armConta.adicionar(cont01);
		armConta.adicionar(cont02);
		
		/*----------------------------------------------*/
		/*Para resolver o problema da falta do método getSaldo no retorno object
		 *é preciso transformar/cast para o tipo Conta*/
		System.out.println("Saldo na posição 0 é: "+((Conta)armConta.pegar(0)).getSaldo());
		System.out.println("Saldo na posição 1 é: "+((Conta)armConta.pegar(1)).getSaldo());
		
		armConta.adicionar(cli01);// Não tem getSaldo
		
		//Precisa fazer um cast Cliente pois é do tipo object
		System.out.println("Nome do Cliente: "+((Cliente)armConta.pegar(2)).getNome());
	}

}
