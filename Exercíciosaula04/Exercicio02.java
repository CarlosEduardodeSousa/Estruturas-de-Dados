package Exercíciosaula04;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int nAleatorio = (int) (Math.random()*100) + 1;

        System.out.println("Tente adivinhar um número (entre 1 e 100)");

        while(true){
            System.out.println("> ");
            int palpite = leia.nextInt();

            if(palpite > nAleatorio){
                System.out.println("Muito Alto! Tente novamente");
            }
            else if(palpite < nAleatorio){
                System.out.println("Muito Baixo! Tente novamente");
            }
            else{
                System.out.println("Você acertou");
                break;
            }
        }

        leia.close();
    }    
}
