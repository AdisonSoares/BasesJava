/*Uma interface pode conter constantes e métodos abstratos.
**Interface é aplicada para servir de contrato para produtos eletronicos.
**Todo o produto eletronico que implementar esta interface obrigatoriamente
**deverão implementar os métodos abstratos.*/

package br.geekuniversity.secao14_;
public interface IEletronico {
	public String MARCA = "Brastemp";
	public void ligar();
	public void desligar();
}
