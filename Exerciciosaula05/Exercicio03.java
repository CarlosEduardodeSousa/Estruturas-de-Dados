package Exerciciosaula05;

import java.util.Arrays;

public class Exercicio03 {
    public static void insertionSort(String [] nomes){
        int n = nomes.length;

        for(int i = 1; i < n; i++){
            String key = nomes[i];
            int j = i - 1;

            while(j >= 0 && nomes[j].compareTo(key) > 0){
                nomes[j + 1] = nomes[j];
                j--;
            }

            nomes[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        String [] nomes = {"Lucas", "Nicolas", "Amanda", "João", "Henrique", "Bruno"};

        insertionSort(nomes);
        System.out.println(Arrays.toString(nomes));
    }
}
