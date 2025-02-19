package Exercícios;

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
        
        Calculadora calc = new Calculadora();

        double num1 = 27;
        double num2 = 3;

        System.out.println("Soma: " + calc.somar(num1, num2));
        System.out.println("Subtração: " + calc.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calc.multiplicar(num1, num2));
        System.out.println("Divisão: " + calc.dividir(num1, num2));
    }
}
