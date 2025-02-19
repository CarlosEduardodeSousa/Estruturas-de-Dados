package Exercícios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int cont = 0;
        int num;
        do{
            cont++;
            System.out.print("Digite um número: ");
            num = leia.nextInt();
            if(num <0){
                System.out.println("Número negativo inserido. Encerrando programa.");
            }
        } while (num >= 0);
        
    }
}
