package Exercícios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = leia.nextInt();

        if(num % 2 == 0){
            System.out.println("O número " + num + " é par");
        }

        else{
            System.out.println("O número " + num + " é impar");
        }

        
    }
}
