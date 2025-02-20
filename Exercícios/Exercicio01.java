package Exercícios;

import java.util.Scanner;

class Calculadora{

    public double somar (double a, double b){
        return a + b;
    }

    public double subtrair (double a, double b){
        return a-b;
    }

    public double multiplicar (double a, double b){
        return a*b;
    }

    public double dividir (double a, double b){
       return a / b;
    }
}



public class Exercicio01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        Calculadora calc = new Calculadora();

        
        System.out.print("Digite o primeiro número: ");
        double num1 = leia.nextDouble();

        System.out.print("digite o segundo número: ");
        double num2 = leia.nextDouble();

        System.out.println("Soma: " + calc.somar(num1, num2));
        System.out.println("Subtração: " + calc.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calc.multiplicar(num1, num2));
        System.out.println("Divisão: " + calc.dividir(num1, num2));
    }
}
