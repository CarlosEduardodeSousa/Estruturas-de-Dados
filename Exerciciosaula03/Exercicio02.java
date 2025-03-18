package Exerciciosaula03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantas palavras deseja inserir? ");
        int n = leia.nextInt();
        leia.nextLine(); 
        
        String[] palavras = new String[n];
        String[] palindromos = new String[n];
        int countPalindromos = 0;
        
      
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            palavras[i] = leia.nextLine();
        }
        
        
        for (int i = 0; i < n; i++) {
            if (ehPalindromo(palavras[i])) {
                palindromos[countPalindromos++] = palavras[i];
            }
        }
        
        
        System.out.println("Palavras palíndromas:");
        for (int i = 0; i < countPalindromos; i++) {
            System.out.println(palindromos[i]);
        }
        
        leia.close();
    }

    
    public static boolean ehPalindromo(String palavra) {
        int esquerda = 0;
        int direita = palavra.length() - 1;
        
        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
}
