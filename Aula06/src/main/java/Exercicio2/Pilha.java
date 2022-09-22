package Exercicio2;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
    }
    
    public Pilha(int capacidade) {
        super(capacidade);
    }
    
    public void empilha(T elemento) {
        //Adiciona no fim por padrão
        super.adiciona(elemento);
    }
    
    public T topo() {
        if(estaVazia()) {
            return null;
        }
        return elementos[tamanhoAtual-1];
    }
    
    public T desempilha() {
        if(estaVazia()) {
            return null;
        }
        T elemento = elementos[tamanhoAtual-1];
        tamanhoAtual--;
        return elemento;
    }
    
}
