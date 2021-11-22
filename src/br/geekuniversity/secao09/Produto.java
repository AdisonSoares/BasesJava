package br.geekuniversity.secao09;
/*Classes, Atributos e Métodos
 
Atributos são caracteristicas da classe/modelo/modelo de dados.
Podemos entender atributos como variáveis da classe.
Outra forma de nomear os atributos é chamando-os de estados.
Atributos são nomeados em letras minúsculas, sem espaço, sem 
caracteres especiais, sem acentuação.
O nome de uma variável pode ser iniciada apenas com letras e underline.

Podemos entender os métodos como a ação que é realizada por um objeto da classe.
Os métodos são comportamentos dos objetos da classe.
Para nomear métodos/comportamento de uma classe usa-se os mesmos requisitos das
funções:

a)Tipo de retorno(Tipo de dado que a função vai retornar)
b)Nome - Corresponde a ação que a função realiza
c)Parâmetro/Argumentos de entrada (opcional)
d)Retorno (Opcional - depende do tipo de retorno).

A diferença entre uma função e um método é que um método faz parte de uma classe
a função é solta, não depende de uma classe.*/

public class Produto {
	String nome;
	float preco;
	float desconto;
	
	void aumentar_preco(float valor) {
		this.preco=this.preco+valor;
	}

}
