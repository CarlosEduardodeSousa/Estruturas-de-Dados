package Aula02;

import java.util.Scanner;

public class Pratica05 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número para contagem regressiva: ");
        int num = leia.nextInt();

        while(num >= 0){
            System.out.println(num);
            num--;
        }

        leia.close();
    }
}
