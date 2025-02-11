import java.util.ArrayList;
import java.util.List;

public class InsercaoLista {
    public static void main(String[] args) {
        

        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.add(999);


        System.out.println("Lista: " + lista);


        lista.remove(2);
        lista.remove(4);

        System.out.println("Lista após a remoção: " + lista);
    }
    
}
