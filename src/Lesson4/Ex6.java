package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        String[] name = new String[3];

        name[0] = "Денис";
        name[1] = "Коля";
        name[2] = "Вася";

        Arrays.sort(name);
        System.out.println(Arrays.toString(name));


    }
}
