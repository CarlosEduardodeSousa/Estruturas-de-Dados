package Aula02;

import java.util.Scanner;

public class Pratica03 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 3: ");
        int num = leia.nextInt();

        switch (num){
            case 1:
                System.out.println("Você escolheu Maçã!");
                break;
            case 2:
                System.out.println("Você escolheu Abacaxi!");
                break;
            case 3:
                System.out.println("Você escolheu Laranja!");
                break;
            default:
                System.out.println("Escolha invalida!");
        }

        leia.close();
    }
}
