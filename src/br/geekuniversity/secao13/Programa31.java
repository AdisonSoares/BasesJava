//Classes abstratas
/*As classes abstratas servem para deixar o programa mais leg�vel,
**ele impede que seja instanciado, criado um objeto, que seja gen�rico.
**Serve tamb�m para restringir os tipos de objetos criados.
**Normalmente as classes abstratas s�o as super classes.
**As classes abstratas ter�o m�todos abstratos.
**M�todos abstratos n�o possuem implementa��o, possuindo apenas
**declara��o, e obrigatoriamente, as classes que herdar�o desta classe
**com m�todo abstrato precissam implementar estes m�todos.
**Implemento s�o os comandos do m�todo, que fica depois das chaves.
**Exemplo: public abstract void outra_mensagem(String texto);*/

package br.geekuniversity.secao13;

import br.geekuniversity.secao12.Aluno;

public class Programa31 {

	public static void main(String[] args) {
		//Pessoa maria = new Pessoa("Maria da Silva",1999,"maria@gmail.com");//N�o � mais poss�vel por ser uma classe abstrata
		Aluno maria = new Aluno("Maria da Silva",1999,"maria@gmail.com","587165");
		System.out.println(maria);
		maria.outra_mensagem("S� sei que nada sei");
	}
}
