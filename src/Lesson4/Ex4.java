package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        int n = 0;


        Scanner in = new Scanner(System.in);

        System.out.println("Укажите размер массива от 5 до 10 включительно: \n");

        n = in.nextInt();
        int[] arr = new int[n];

        if (n > 5 && n <= 10) {


            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 20);

            }

        }else{
            System.out.println("Ошибка! \nВведите размер массива от 5 до 10 включительно");
        }
        System.out.println(Arrays.toString(arr));









    }
}
