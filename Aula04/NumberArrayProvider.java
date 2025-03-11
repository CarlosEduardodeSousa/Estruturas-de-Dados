package Aula04;

import java.util.Arrays;
import java.util.Random;

public class NumberArrayProvider {
    public static final int [] numbers = new int [10000];

    static{
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
    }

    public static int [] getnumbers(){
        return Arrays.copyOf(numbers, numbers.length);
    }
}
