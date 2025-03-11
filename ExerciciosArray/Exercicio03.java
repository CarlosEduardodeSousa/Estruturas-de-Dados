package ExerciciosArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Quantos números deseja adicionar: ");
        int qtd = leia.nextInt();

        int soma_total = 0;
        int maior = 0;

        for(int i = 0; i < qtd; i++){
            System.out.println("Digite o " + (i+1) + " número: ");
            int num = leia.nextInt();
            soma_total = soma_total + num;
            numeros.add(num);

            if(num > maior){
                maior = num;
            }
        }

        double media = soma_total / numeros.size();

        System.out.println("Média dos números: " +  media);
        System.out.println("Maior número: " + maior);
        
        leia.close();
    }
}
