//Interfaces
/*Interfaces são conhecidos como  contratos.
**Uma empresa criou um contrato "com regras" para definir
**a implementação de um produto/serviço.
**Duas pessoas vão implementar um produto/serviço baseado neste contrato, ou seja,
**o produto/serviço vão ser iguais,cada um com suas caracteristicas.
**Quem implementar esse contrato é obrigado a seguir as regras.
**A diferença entre uma interface e um classe abstrata é que a classe abstrata
**permite criar variáveis e métodos com implementação assim como constantes e 
**métodos abstratos mas a interface permite apenas criar constantes e métodos
**abstratos, permitindo um controle maior do que as classes filhas
**estarão implementando.*/

package br.geekuniversity.secao14;

import br.geekuniversity.secao14.Ventilador;

@SuppressWarnings("unused")
public class Programa33 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Ventilador ventilador = new Ventilador();
		
		System.out.println("A marca do aparelho é: "+ventilador.MARCA);
		ventilador.desligar();
		ventilador.ligar();
		ventilador.desligar();
	}
}
