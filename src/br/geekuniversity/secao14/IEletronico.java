/*Uma interface pode conter constantes e métodos abstratos.
**Interface é aplicada para servir de contrato para produtos eletrônicos.
**Todo o produto eletrônico que implementar esta interface obrigatoriamente
**deverão implementar os métodos abstratos.*/

package br.geekuniversity.secao14;
public interface IEletronico {
	public String MARCA = "Brastemp";
	public void ligar();
	public void desligar();
}
