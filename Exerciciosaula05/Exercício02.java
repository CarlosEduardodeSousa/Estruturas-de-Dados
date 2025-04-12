package Exerciciosaula05;

import java.util.Arrays;

public class Exercício02 {
    public static int selectionSort(int [] arr){
        int n = arr.length;
        int trocas = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                trocas++;
            }
        }

        return trocas;
    }

    public static void main(String[] args) {
        int [] arr = {64, 25, 12, 22, 11};
        
        int trocas = selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Número de trocas: " + trocas);
    }
}
