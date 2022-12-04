package Lesson4;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: \n");

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * n);
        }

        int max = (int) array[0];
        int min = (int) array[0];
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = (int) array[i];
            if(min > array[i])
                min = (int) array[i];
            avg += array[i]/array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
