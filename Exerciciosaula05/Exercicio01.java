package Exerciciosaula05;

import java.util.Arrays;

public class Exercicio01 {
    public static void bubbleSort(int [] arr){
        int n = arr.length;

        for(int i=0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {5,2,4,1,7,9,8,6,5,2,};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
