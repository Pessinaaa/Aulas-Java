package Exercicio2;

public class EstruturaEstatica<T> {
    public T[] elementos;
    public int tamanhoAtual;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanhoAtual = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }
    
    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if(this.tamanhoAtual < this.elementos.length) {
            this.elementos[this.tamanhoAtual] = elemento;
            this.tamanhoAtual++;
            return true;
        }
        return false;
    }
    
    public boolean adiciona(int posicao, T elemento) {
        if(!(posicao>=0 && posicao<tamanhoAtual)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        aumentaCapacidade();
        for(int i=tamanhoAtual-1; i>=posicao; i--) {
            elementos[i+1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanhoAtual++;
        return true;
    }
 
    public void aumentaCapacidade() {
        if(tamanhoAtual == elementos.length) {
            T[] elementosNovos = (T[]) new Object[elementos.length + 10];
            for(int i=0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return tamanhoAtual;
    }
    
    @Override //usado para modificar métodos
    public String toString() {
        StringBuilder builder = new StringBuilder(); // capaz de manipular dados da string e criar novas vars a partir disto
        builder.append("[");
        
        for(int i=0; i<tamanhoAtual-1; i++) {
            builder.append(this.elementos[i]);
            builder.append(", ");
        } 
        
        // coloca o ultimo
        if(tamanhoAtual > 0) {
            builder.append(this.elementos[tamanhoAtual-1]);
        }
        
        builder.append("]");
        
        return builder.toString();
    }
    
    public boolean estaVazia() {
        return tamanhoAtual == 0;
    }
    
    public void remove(int posicao) {
        if(!(posicao >= 0 && posicao < tamanhoAtual)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i=posicao; i<tamanhoAtual-1; i++) {
            elementos[i] = elementos[i+1];
        }
        tamanhoAtual--;
    }
}
