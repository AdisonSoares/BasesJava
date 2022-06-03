/*HashMap
 *Ela implementa a interface Map e trabalha com chave/valor.
 *Não aceita chaves duplicadas, porém se tiver chave diferente
 *É aceito mesmo com valores duplicados.*/

package br.geekuniversity.secao19;
import java.util.HashMap;
import java.util.Map;

import br.geekuniversity.secao11.Cliente;
import br.geekuniversity.secao11.Conta;

public class Programa49 {
	public static void main(String[] args) {
		Map<String, Conta>contas = new HashMap<String, Conta>();
		
		Cliente cliente01 = new Cliente(31,"Jair Souza", "Qnh 30");
		Cliente cliente02 = new Cliente(34,"Priscila Trindade", "Qnh 35");
		
		Conta conta01 = new Conta(1, 200, 300, cliente01);
		Conta conta02 = new Conta(1, 200, 300, cliente02);
		
		contas.put("Pessoa fisica", conta01);
		contas.put("Pessoa juridica", conta02);
		
		/*Tamanho/quantidade da conta*/
		System.out.println(contas.size());
		
		/*Exibir conteudo da conta somente com a chave*/
		System.out.println(contas.get("Pessoa fisica"));
	}
}
