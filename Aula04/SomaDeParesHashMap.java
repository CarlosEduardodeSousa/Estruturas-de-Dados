package Aula04;

import java.util.HashMap;

public class SomaDeParesHashMap {
    public static int contagemDeParesHashMap(int [] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for(int num : nums){
            int complement = target - num;
            if(map.containsKey(complement)){
                count+= map.get(complement);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
                
        }

        return count;
    }


    public static void main(String[] args) {
        int [] nums = NumberArrayProvider.getnumbers(); // criar métodos para gerar números
        int target = 6;

        long startTime = System.nanoTime();

        int result = contagemDeParesHashMap(nums, target);

        long endTime = System.nanoTime();

        System.out.println("Números de pares encontrados: " + result);
        System.out.println("Tempo de execução: " + (endTime - startTime) / 1_000_000_000.0 + " segundos");
    }
}
