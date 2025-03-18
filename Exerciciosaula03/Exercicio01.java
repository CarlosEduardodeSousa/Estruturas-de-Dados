package Exerciciosaula03;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int qtd = leia.nextInt();

        int [] numeros = new int[qtd];
        int countPares = 0;
        int countImpares = 0;
       

        for(int i = 0; i < qtd; i++){
            System.out.print("Digite o " + (i+1) + " número inteiro: ");
            numeros[i] = leia.nextInt();
            if (numeros[i] % 2 == 0){
                countPares++;
            }

            else{
                countImpares++;
            }
        }

        int [] pares = new int[countPares];
        int [] impares = new int[countImpares];
        int indexPares = 0;
        int indexImpares = 0;


        for(int num : numeros){
            if (num % 2 == 0) {
                pares[indexPares++] = num;
            }

            else{
                impares[indexImpares++] = num;
            }
        }

        Arrays.sort(pares);
        Arrays.sort(impares);

        System.out.println("");

        System.out.println("Números pares ordenados: " + Arrays.toString(pares));
        System.out.println("Números impares digitados: " + Arrays.toString(impares));

        leia.close();
       
    }
}
