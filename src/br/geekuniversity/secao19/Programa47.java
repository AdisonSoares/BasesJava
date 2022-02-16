/*Listas 03 - Acrescentando objetos*/

package br.geekuniversity.secao19;
import java.util.ArrayList;
import java.util.Collections;

import br.geekuniversity.secao11.Cliente;

public class Programa47 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Cliente> clienteArrayLst = new ArrayList<Cliente>();
		Cliente cliente01 = new Cliente(32,"Rivaldo Silva", "Quadra 14");
		Cliente cliente02 = new Cliente(18,"Renan Carlos", "Quadra 15");
		
		/*Adicionando os objetos clientes no arraylist*/
		clienteArrayLst.add(cliente01);
		clienteArrayLst.add(cliente02);
		
		/*Exibindo dados*/
		for(Cliente objCliente:clienteArrayLst) {
			System.out.println(objCliente);
		}
		System.out.println();
		
		/*Exibindo dados ordenados*/
		Collections.sort(clienteArrayLst);
		for(Cliente objCliente:clienteArrayLst) {
			System.out.println(objCliente);
		}
		System.out.println();
	}
}
