package Aula02;


class Produto{
    String nome;
    Double preco;

    Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    void tributacao(){
        System.out.println("Papai Lula taxou seu produto, e agor o valor é: " + (preco + 0.20) + preco);
    }
}




public class Pratica06 {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Pc Gamer", 5000.00);

        p1.tributacao();
    }
}
