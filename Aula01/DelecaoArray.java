import java.util.Arrays;

public class DelecaoArray {
    public static void main(String[] args) {
        
        int [] array = {10, 20, 30, 40, 50};

        int remover_indice = 0;

        int tamanho = 5;

        for( int i= remover_indice; i < tamanho - 1; i++){
            array[i] = array[i+1];
        }


        System.out.println("Array após a deleção: " + Arrays.toString(array));
    }
    
}
