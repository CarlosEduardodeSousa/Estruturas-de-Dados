package Aula05;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        boolean swapped;

        for(int i=0; i < n - 1; i++){
            swapped = false;

            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void main(String[] args) {
        int [] arr = {3,5,7,1,4,2,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
