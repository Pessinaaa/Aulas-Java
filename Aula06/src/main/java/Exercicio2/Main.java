package Exercicio2;

public class Main {

    public static void main(String[] args) {
        //Pilha<Integer> pilha = new Pilha<Integer>();;
        
        //System.out.println(pilha);
        //System.out.println(pilha.estaVazia());
        //System.out.println(pilha.topo());
        
        //for(int i=1; i<=15; i++) {
        //    pilha.empilha(i);
        //}
        
        //System.out.println(pilha.topo());
        //System.out.println(pilha);
        //System.out.println(pilha.tamanho());
        
        //System.out.println("Desempilhar o elemento: " + pilha.desempilha());
        //System.out.println(pilha);
        
        Fila<Integer> fila = new Fila<Integer>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        
        System.out.println("A fila está vazia? " + fila.estaVazia());
        System.out.println("Qual o tamanho da fila " + fila.tamanho());
        System.out.println(fila.toString());
        System.out.println("O primeiro da fila é " + fila.espiar());
        System.out.println("O elemento removido da fila é "+ fila.desenfileira());
        System.out.print("O primeiro da fila é " + fila.espiar());
    }
    
}
