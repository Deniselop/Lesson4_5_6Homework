package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean index = true;

        int[] array = new int[]{1, 2, 3, 4, 5};
        int n = in.nextInt();

        int[] newArray = new int[array.length - 1];


        for (int i = 0; i < array.length; i++){

            if (index == true) {
                if (n == array[i]) {
                    index = false;
                }
            }else{
                System.arraycopy(array, 0,newArray,0,4);
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
    }
}
