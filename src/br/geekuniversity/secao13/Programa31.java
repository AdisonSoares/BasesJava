//Classes abstratas
/*As classes abstratas servem para deixar o programa mais legível,
**ele impede que seja instanciado, criado um objeto, que seja genérico.
**Serve também para restringir os tipos de objetos criados.
**Normalmente as classes abstratas sáo as super classes.
**As classes abstratas teráo métodos abstratos.
**Métodos abstratos não possuem implementação, possuindo apenas
**declaração, e obrigatoriamente, as classes que herdarão desta classe
**com método abstrato precissam implementar estes métodos.
**Implemento são os comandos do método, que fica depois das chaves.
**Exemplo: public abstract void outra_mensagem(String texto);*/

package br.geekuniversity.secao13;

import br.geekuniversity.secao12.Aluno;

public class Programa31 {

	public static void main(String[] args) {
		//Pessoa maria = new Pessoa("Maria da Silva",1999,"maria@gmail.com");//Não é mais possível por ser uma classe abstrata
		Aluno maria = new Aluno("Maria da Silva",1999,"maria@gmail.com","587165");
		System.out.println(maria);
		maria.outra_mensagem("Só sei que nada sei");
	}
}
