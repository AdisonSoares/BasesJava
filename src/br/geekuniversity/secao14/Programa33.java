//Interfaces
/*Interfaces s�o conhecidos como  contratos.
**Uma empresa criou um contrato "com regras" para definir
**a implementa��o de um produto/servi�o.
**Duas pessoas v�o implementar um produto/servi�o baseado neste contrato, ou seja,
**o produto/servi�o v�o ser iguais,cada um com suas caracteristicas.
**Quem implementar esse contrato � obrigado a seguir as regras.
**A diferen�a entre uma interface e um classe abstrata � que a classe abstrata
**permite criar vari�veis e m�todos com implementa��o assim como constantes e 
**m�todos abstratos mas a interface permite apenas criar constantes e m�todos
**abstratos, permitindo um controle maior do que as classes filhas
**estar�o implementando.*/

package br.geekuniversity.secao14;

import br.geekuniversity.secao14.Ventilador;

@SuppressWarnings("unused")
public class Programa33 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Ventilador ventilador = new Ventilador();
		
		System.out.println("A marca do aparelho �: "+ventilador.MARCA);
		ventilador.desligar();
		ventilador.ligar();
		ventilador.desligar();
	}
}
