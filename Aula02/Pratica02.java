package Aula02;

import java.util.Scanner;

public class Pratica02 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = leia.nextInt();

        if (idade >= 18){
            System.out.println("Já pode ser preso!");
        }

        else{
            System.out.println("Fundação CASA!");
        }

        leia.close();
    }
}
