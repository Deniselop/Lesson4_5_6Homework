package Lesson4;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {

        String[] array = new String[5];
        int n = 0;


        array[0] = "Денис";
        array[1] = "Настя";
        array[2] = "Коля";
        array[3] = "Вася";
        array[4] = "Антон";

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++ ) {

            if (i != 0 && i % 2 !=0) {
                array[i] = "null";
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
