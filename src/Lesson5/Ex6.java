package Lesson5;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {

        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = (int) (Math.random() * 5);
            }
            Arrays.sort(array[i]);
        }
        System.out.println(Arrays.deepToString(array));

    }
}
