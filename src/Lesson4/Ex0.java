package Lesson4;

import java.util.Scanner;

public class Ex0 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] array = new int[]{1, 2, 3, 4, 5};


        for (int i = 0; i < 1; i++){
            System.out.println("Введите номер в массиве: \n");
            int a = in.nextInt();
            array[i] = a;
        }
        int temp = 0;
        System.out.println("Введите число: \n");
        int m = in.nextInt();
        for (int i = 0; i < array.length; i++){
            if (m == array[i]){
                temp = array[i];
            }
        }

        System.out.println("Чисел вошедших в массив - " + temp);










    }
}
