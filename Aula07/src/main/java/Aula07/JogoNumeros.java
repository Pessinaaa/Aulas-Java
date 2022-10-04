package Aula07;

import java.util.Random;
import java.util.Scanner;


public class JogoNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int x, y, c = 1;
        y = aleatorio.nextInt(20);
        System.out.println("Tente acertar o número entre 0 e 20:");
        x = sc.nextInt();
        while (x != y){
            System.out.println("Errou!");
            if (y < x){
                System.out.println("Tente um número menor!");
            } else {
                System.out.println("Tente um número maior!");
            }
            c++;
            x = sc.nextInt();
        }
        System.out.println("Ganhou!\nVocê acertou na " + c + "° tentativa");
    }
}
