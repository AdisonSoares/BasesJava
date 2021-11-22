package br.geekuniversity.secao09;
/*Classes, Atributos e M�todos
 
Atributos s�o caracteristicas da classe/modelo/modelo de dados.
Podemos entender atributos como vari�veis da classe.
Outra forma de nomear os atributos � chamando-os de estados.
Atributos s�o nomeados em letras min�sculas, sem espa�o, sem 
caracteres especiais, sem acentua��o.
O nome de uma vari�vel pode ser iniciada apenas com letras e underline.

Podemos entender os m�todos como a a��o que � realizada por um objeto da classe.
Os m�todos s�o comportamentos dos objetos da classe.
Para nomear m�todos/comportamento de uma classe usa-se os mesmos requisitos das
fun��es:

a)Tipo de retorno(Tipo de dado que a fun��o vai retornar)
b)Nome - Corresponde a a��o que a fun��o realiza
c)Par�metro/Argumentos de entrada (opcional)
d)Retorno (Opcional - depende do tipo de retorno).

A diferen�a entre uma fun��o e um m�todo � que um m�todo faz parte de uma classe
a fun��o � solta, n�o depende de uma classe.*/

public class Produto {
	String nome;
	float preco;
	float desconto;
	
	void aumentar_preco(float valor) {
		this.preco=this.preco+valor;
	}

}
