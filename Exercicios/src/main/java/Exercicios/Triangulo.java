package Exercicios;

import javax.swing.JOptionPane;

public class Triangulo {
    float base;
    float altura;
    float area;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    float calculaArea(){
        area = (base * altura)/2;
        return area;
    }
    
    void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Dados do triângulo" +
                "\nBase: " + base +
                "\nAltura: " + altura + 
                "\nÁrea: " + area);
    }   
}
