package Aula04;

public class SomaDeParesForçaBruta {
    public static int contagemDeParesForcaBruta(int [] nums, int target){
        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(nums[i] + nums[j] == target){
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int [] nums = NumberArrayProvider.getnumbers(); // criar métodos para gerar números
        int target = 6;

        long startTime = System.nanoTime();

        int result = contagemDeParesForcaBruta(nums, target);

        long endTime = System.nanoTime();

        System.out.println("Números de pares encontrados: " + result);
        System.out.println("Tempo de execução: " + (endTime - startTime) / 1_000_000_000.0 + " segundos");
    }
}
