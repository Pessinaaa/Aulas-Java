package Exercicio2;

import java.util.Stack;

public class TesteApi {
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        
        System.out.println(stack.isEmpty());
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Tamanho: " + stack.size());
        
        // Exibe a pilha
        System.out.println(stack);
        
        // Verifica topo
        System.out.println("Topo: " + stack.peek());
        
        // desembilha
        System.out.println(stack.pop());
        
        System.out.println(stack);
    }
     
}
