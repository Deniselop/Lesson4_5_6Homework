package Lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
            System.out.println(arr[i]);
        }

        System.out.println("Введите число, которое хотите удалить из массива: \n");

        int[] result = new int[arr.length - in.nextInt()];

        int index = in.nextInt();

        System.arraycopy(arr, 0, result, 0, index);

        System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);

        System.out.println(Arrays.toString(result));






    }
}
