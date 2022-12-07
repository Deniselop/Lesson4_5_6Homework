package Lesson4;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {

        int[] array1 = new int[]{2,4,6,8,10};
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[]{1,3,5,7,9};
        System.out.println(Arrays.toString(array2));

        int avg1 = 0;
        int avg2 = 0;

        for (int i = 0; i < array1.length; i++ ){
            avg1 += array1[i]/ array1.length;
        }
        for (int k = 0; k < array2.length; k++){
            avg2 += array2[k]/ array2.length;
        }

        System.out.println("Среднее арифметическое первого массива - " + avg1);
        System.out.println("Среднее арифметическое второго массива - " + avg2);

        if (avg1 > avg2){
            System.out.println("Среднее арифметическое первого массива больше второго");
        }else{
            System.out.println("Среднее арифметическое второго массива больше первого");
        }if (avg1 == avg2){
            System.out.println("Средние арифметические массивов равны");
        }
    }
}
