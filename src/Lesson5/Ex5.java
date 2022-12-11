package Lesson5;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {

        int index1 = 0;
        int index2 = 0;


        int[][] array = new int[3][3];

        int[] array1 = new int[3];
        int[] array2 = new int[3];

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = (int) (Math.random() * 5);
                if (i == k) {
                    array1[index1] = array[i][k];
                    index1++;
                }
                if (i + k == array.length - 1) {
                    array2[index2] = array[i][k];
                    index2++;
                }
            }
        }

        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
