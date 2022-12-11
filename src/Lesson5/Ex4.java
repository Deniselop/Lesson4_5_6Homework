package Lesson5;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {

        int sum = 0;

        int[][] array = new int[8][8];
        for (int i = 0; i < array.length; i++){
            for (int k = 0; k < array[i].length; k++){
                array[i][k] = (int)(Math.random() * 5);
                sum += array[i][k];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(sum);


    }
}
