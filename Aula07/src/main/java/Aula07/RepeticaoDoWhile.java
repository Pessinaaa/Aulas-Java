package Aula07;

import java.util.Scanner;

public class RepeticaoDoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a, soma = 0;
        String r;
        int cont = 0;
        do {
            System.out.println("Informe um número:");
            a = sc.nextFloat();
            if (a > 0){
                soma = soma + a;
                cont++;
            }
            System.out.println("deseja continuar? (s/n):");
            r = sc.next();
        }
        while (r.equalsIgnoreCase("s"));
        System.out.println("A média é " + (soma/cont));
    }
}
