package Exercícios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int soma_total = 0;
        for (int cont = 1; cont <= 5; cont++){
            System.out.print("Digite o " + cont + " número: ");
            int num = leia.nextInt();
            soma_total = soma_total + num;
        }

        System.out.println("");
        System.out.println("A soma de todos os número foi: " + soma_total);

       
    }
}
