package Exercícios;

class ContaBancaria{
    String titular;
    double saldo;
    int numeroConta;

    ContaBancaria(String titular, int numeroConta, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numeroConta = numeroConta;
    }

    void depositar(double valor){
        if (valor > 0){
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado");
        }

        else{
            System.out.println("Valor de depósito invalido");
        }
    }

    void sacar (double valor){
        if (valor > 0 && valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado");
        }

        else{
            System.out.println("Saldo Insuficiente.");
        }
    }

    void exibirSaldo(){
        System.out.println("Saldo atual R$: " + saldo);
    }
}


public class Exercicio05 {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria("William", 27, 1000);

        System.out.println("Titular: " + conta.titular + " Número da Conta: " + conta.numeroConta);
        System.out.println("");
        

        conta.exibirSaldo();
        conta.depositar(500);
        conta.exibirSaldo();
        conta.sacar(800);
        conta.exibirSaldo();
    }
}
