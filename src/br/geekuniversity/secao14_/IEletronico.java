/*Uma interface pode conter constantes e m�todos abstratos.
**Interface � aplicada para servir de contrato para produtos eletronicos.
**Todo o produto eletronico que implementar esta interface obrigatoriamente
**dever�o implementar os m�todos abstratos.*/

package br.geekuniversity.secao14_;
public interface IEletronico {
	public String MARCA = "Brastemp";
	public void ligar();
	public void desligar();
}
