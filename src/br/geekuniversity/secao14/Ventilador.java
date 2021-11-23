package br.geekuniversity.secao14;
public class Ventilador implements IEletronico{
	private boolean ligado = false;
	
	
	@Override
	/**
	 * M�todos abstratos da interface
	 */
	public void ligar() {
		if(!this.ligado) {
			this.ligado = true;
			System.out.println("Aparelho ligado!");
		}
	}
	@Override
	/**
	 * M�todos abstratos da interface
	 */
	public void desligar() {
		if(this.ligado) {
			this.ligado = false;
			System.out.println("Aparelho desligado!");
		}
	}
}
