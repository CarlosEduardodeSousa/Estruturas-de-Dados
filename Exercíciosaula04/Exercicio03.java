package Exercíciosaula04;

import java.util.HashMap;

public class Exercicio03 {
   public static void main(String[] args) {
     int [] nums = {1,2,3,2,4,1,5,2,3,4};

     HashMap<Integer, Integer> map = new HashMap<>(); 
     
     for(int num : nums){
        map.put(num, map.getOrDefault(num, 0) + 1);
     }

     for(var entry : map.entrySet()){
        System.out.println(entry.getKey() + " aparece " + entry.getValue() + (entry.getValue() > 1 ? " vezes" : " vez"));
     }
   }
}
