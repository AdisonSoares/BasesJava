package br.geekuniversity.secao21;

/**
 * @Semelhante_a_alocacao_dinamica
 * @adicionaNoComeco Vai receber o valor da primeira posicao(Object elemento),
 * e vai apontar para o proximo elemento que eh nulo(Celula primeira).
 * @StringBuilder Significa String montador(builder), objetivo eh montar uma String.
 * @toString A funcao toString tem como objetivo apresentar o elemento e depois
 * acrescentar uma virgula, dentro do colchete.
 * @adicionaNoComeco Vai adicionando objetos no inicio da lista e depois aponta para null
 * @adicionaNoFim Vai adicionando objetos no fim da lista e depois aponta para nova celula
 */
public class ListaLigada {
    private Celula primeira = null;
    private Celula ultima = null;
    private int total = 0;

    public void adicionaNoComeco(Object elemento) {
        if (this.total == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        }else{
            Celula nova = new Celula(elemento, this.primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.total++;
    }

    public void adicionaNoFim(Object elemento) {
        if (this.total == 0) {
            this.adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProximo(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.total++;
        }
    }

    public void adicionaNoMeio(int posicao, Object elemento) {
        if (posicao == 0) {
            this.adicionaNoComeco(elemento);
        }else if(posicao == this.total){
            this.adicionaNoFim(elemento);
        }else{
            Celula anterior = this.pegaCelula(posicao-1);
            Celula proxima = anterior.getProximo();
            Celula nova = new Celula(elemento, anterior.getProximo());
            anterior.setProximo(nova);
            nova.setAnterior(anterior);
            proxima.setAnterior(nova);
            this.total++;
        }
    }

    public Object pega(int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }

    public void removeQualquerPosicao(int posicao) {
        //Se tiver apenas um elemento
        if (posicao == 0) {
            this.removeDoComeco();
        //Se for o ultimo elemento
        }else if (posicao == this.total-1) {
            this.removeDoFim();
        //Se for o elemento do meio
        } else {
            Celula anterior = this.pegaCelula(posicao-1);
            Celula atual = anterior.getProximo();
            Celula proxima = atual.getProximo();
            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);
            this.total--;
        }
    }

    public void removeDoFim() {
        if (this.total == 1) {
            this.removeDoComeco();
        }else{
            Celula penultima = this.ultima.getAnterior();
            penultima.setProximo(null);
            this.ultima = penultima;
            this.total--;
        }
    }

    public void removeDoComeco(){
        if (this.total == 0) {
            throw new IllegalArgumentException("Lista vazia");
        }else{
            this.primeira = this.primeira.getProximo();
            this.total--;
        }
        if (this.total == 0) {
            this.ultima = null;
        }
    }

    public int tamanho() {
        return this.total;
    }

    public boolean contem(Object obj) {
       Celula atual = this.primeira;
       while (atual != null){
           if (atual.getElemento().equals(obj)) {
               return true;
           }
           atual = atual.getProximo();
       }
        return false;
    }

    @Override
    public String toString() {
        if (this.total == 0) {
            return "[]";
        }
        Celula atual = this.primeira;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < total; i++) {
            builder.append(atual.getElemento());
            builder.append(",");
            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.total;
    }

    private Celula pegaCelula(int posicao){
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inexistente");
        }
        Celula atual = this.primeira;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }
}
