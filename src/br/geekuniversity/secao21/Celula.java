package br.geekuniversity.secao21;

/**
 * @Cada_elemento_vai_ser_uma_celula
 * Essa classe representa uma celula (container), onde teremos
 * o objeto(valor) e uma celula que sera a ligacao para o proximo.
 *
 * @Atributo_object
 * Um atributo do tipo Object se chama elemento, representa o valor inserido no vetor,
 * eh do tipo Object pois nao esta definido o tipo de elemento que sera colocado, tornando
 * o atributo bem generico, podendo ter varios tipos de objetos.
 *
 * @Atributo_celula
 * Esse atributo vai fazer a ligacao da celula atual com a proxima celula
 *
 */
public class Celula {
    private Object elemento;
    private Celula proximo;
    private Celula anterior;


    public Celula(Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    //Passando a informacao o construtor acima usando o this
    public Celula(Object elemento){
        this(elemento, null);
    }

    public Celula getProximo() {
        return this.proximo;
    }
    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return this.elemento;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }
}
