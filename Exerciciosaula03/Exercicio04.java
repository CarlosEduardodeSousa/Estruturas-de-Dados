package Exerciciosaula03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ArrayList<String> contatos = new ArrayList<>();

        System.out.println("Digite a quantidade de contatos para cadastrar: ");
        int qtd = leia.nextInt();
        leia.nextLine();

        for(int i = 0; i < qtd; i++){
            System.out.println("Digite o nome do contato: ");
            String nome = leia.nextLine();
            System.out.println("Digite o telefone do contato: ");
            String telefone = leia.nextLine();
            contatos.add(nome  + " - " + telefone);
        }

        System.out.println("Digite um nome para buscar: ");
        String buscaNome = leia.nextLine();
        
       System.out.println(contatos.contains(buscaNome) ? "Contato encontrado!" : "Contato não encontrado!");

        System.out.println("");
        System.out.println("Lista de contatos: ");

        for(int i = 0; i < contatos.size(); i++){
            System.out.println(contatos.get(i));
        }

        leia.close();
    }
}
