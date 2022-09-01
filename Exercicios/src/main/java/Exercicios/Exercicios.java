package Exercicios;

public class Exercicios {

    public static void main(String[] args) {
        Triangulo t1, t2;
        
        t1 = new Triangulo();
        
        t2 = new Triangulo(10, 20);
        
        t2.calculaArea();
        t2.imprimeDados();
    }
}
