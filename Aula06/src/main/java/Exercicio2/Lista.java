package Exercicio2;

public class Lista<T> extends EstruturaEstatica<T> {

    public Lista(int capacidade) {
        super(capacidade);
    }

    public Lista() {
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }
    
    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }
    
}
