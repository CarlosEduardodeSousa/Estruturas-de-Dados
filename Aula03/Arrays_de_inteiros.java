package Aula03;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_de_inteiros {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        // Criando o Array

        System.out.println("Digite a quantidade de números: ");
        int n = leia.nextInt();

        // Integer permite valores inteiros e nulos

        Integer [] vetor = new Integer[n];

        System.out.println("");
        System.out.println("---------------------------------------------------");
        System.out.println("Digite " + n +  " número inteiros: ");
        for(int i = 0; i < n; i++){
            vetor[i] = leia.nextInt();
        }

        System.out.println("");

        System.out.println("Digite um número para buscar: ");
        int busca = leia.nextInt();

        boolean encontrado = false;

        // Buscar no array

        for(Integer num : vetor){
            if(num!= null && num == busca){
                encontrado = true;
                break;
            }
        }

        // Boolean : true : false
        System.out.println( encontrado? "Número " + busca +  " foi encontrado com sucesso!" : 
                " O número " + busca + " não foi encontrado no array!");

        // Remoção

        System.out.println("---------------------------------------------------");
        System.out.println("Digite um número para ser removido: ");
        int remover = leia.nextInt();

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] != null && vetor[i] == remover){
                vetor[i] = null;
                break;
            }
        }

        System.out.println("Array após a remoção: " + Arrays.toString(vetor));

        // Ordenado

        System.out.println("---------------------------------------------------");

        Arrays.sort(vetor, ( Integer a, Integer b) ->{
            if(a == null) return 1;
            if(b == null) return -1;
            return a -b;
        });

        System.out.println("Arrays ordenado: " + Arrays.toString(vetor));

        leia.close();
    }
}
