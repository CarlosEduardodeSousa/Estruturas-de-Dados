package Aula02;

class Pessoa{
    String nome;
    String cpf;
    int idade;


    Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    void comer(){
        System.out.println(nome + " está comendo!");
    }

    void dormir(){
        System.out.println(nome + " está dormindo!");
    }

    void falar(){
        System.out.println(nome + " está falando!");
    }
}



public class Pratica01 {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Marina", "022.200.700.-12", 27);
        Pessoa p2 = new Pessoa("Felipe", "039.217.928-27", 42);

        p1.comer();
        p1.falar();

        p2.dormir();

        System.out.println("");
        System.out.println("Nome: " + p1.nome + " CPF: " + p1.cpf + " Idade: " + p1.idade);
        System.out.println("");
        System.out.println("Nome: " + p2.nome + " CPF: " + p2.cpf + " Idade: " + p2.idade);
        System.out.println("");
    }
}
