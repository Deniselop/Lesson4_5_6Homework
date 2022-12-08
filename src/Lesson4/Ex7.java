package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 0;

        n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        boolean isSorted = false;
        int buf;

        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length-1; i++){
                if (array[i] > array[i + 1]){
                    isSorted = false;
                }
            }



        }
    }
}
