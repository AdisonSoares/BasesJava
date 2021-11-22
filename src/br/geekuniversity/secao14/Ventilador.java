package br.geekuniversity.secao14;
public class Ventilador implements IEletronico{
	private boolean ligado = false;
	
	//Métodos abstratos da interface
	@Override
	public void ligar() {
		if(!this.ligado) {
			this.ligado = true;
			System.out.println("Aparelho ligado!");
		}
	}
	@Override
	public void desligar() {
		if(this.ligado) {
			this.ligado = false;
			System.out.println("Aparelho desligado!");
		}
	}
}
