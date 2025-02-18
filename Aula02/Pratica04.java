package Aula02;

import java.util.Scanner;

public class Pratica04 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual tabuada você deseja ver: ");
        int num = leia.nextInt();

        for(int c = 1; c <= 10; c++){
            int resp = num * c;
            System.out.println(num + " X " + c + " = " + resp);
        }

        leia.close();
    }
}
