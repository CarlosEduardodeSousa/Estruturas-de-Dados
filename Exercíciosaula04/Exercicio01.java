package Exercíciosaula04;

public class Exercicio01 {
        public static void main(String[] args) {
        int nums [] = {2,4,3,5,7,8,1,9};
        int target = 10;
        
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    count++;
                }
            }
        }

        System.out.println("Número de pares encontrados: " + count);
    }
}
