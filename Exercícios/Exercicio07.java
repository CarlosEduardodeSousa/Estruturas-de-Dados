package Exercícios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome de usuario: ");
        String usuario = leia.next();

        System.out.print("Digite sua senha: ");
        String senha = leia.next();

        if(usuario.equals("admin") && senha.equals("1234")){
            System.out.println("Login bem-sucedido!");
        }

        else{
            System.out.println("Usuário ou senha incorretos");
        }
    }
}
