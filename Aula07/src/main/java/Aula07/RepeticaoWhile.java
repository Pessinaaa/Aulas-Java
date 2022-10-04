package Aula07;

import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = 1, soma = 0, cont = 0;
        while(A > 0){
            System.out.println("Digite um valor: ");
            A = sc.nextInt(A);
            if (A > 0){
                soma = soma + A;
                cont++;
            }
        }
        System.out.println("A média é: " + (soma/cont));
    }
}
