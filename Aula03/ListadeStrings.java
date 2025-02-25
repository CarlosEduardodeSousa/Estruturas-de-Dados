package Aula03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListadeStrings {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        // Definir tamanho

        System.out.println("");
        System.out.println("Quantos nomes deseja adicionar: ");
        int qtd = leia.nextInt();
        leia.nextLine();

        // Adicionando nomes

        System.out.println("");
        System.out.println("Digite os nomes: ");
        for (int i = 0; i < qtd; i++){
            nomes.add(leia.nextLine());
        }

        System.out.println("");


        // Buscando

        System.out.println("Digite o nome que queira buscar: ");
        String busca = leia.nextLine();
        System.out.println(nomes.contains(busca)? " Nome encontrado": " Nome não encontrado");

        System.out.println("");

        // Remoção

        System.out.println("Digite o nome que você queira remover: ");
        String remover = leia.nextLine();
        if (nomes.remove(remover)){
            System.out.println("Nome removido com sucesso!");
        }

        else{
            System.out.println("Nome não encontrado");
        }

        System.out.println("Lista após a remoção: " + nomes);

        System.out.println("");

        // Ordenação

        Collections.sort(nomes);
        System.out.println("Lista ordenada: " + nomes);

        leia.close();
    }
}
