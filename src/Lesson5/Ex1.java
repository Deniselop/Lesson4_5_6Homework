package Lesson5;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        byte[][][] mass = new byte[2][2][3];

        mass[0][0][0] = 1;
        mass[0][0][1] = 2;
        mass[0][0][2] = 3;
        mass[0][1][0] = 4;
        mass[0][1][1] = 5;
        mass[0][1][2] = 6;
        mass[1][0][0] = 7;
        mass[1][0][1] = 8;
        mass[1][0][2] = 9;
        mass[1][1][0] = 10;
        mass[1][1][1] = 11;
        mass[1][1][2] = 12;

        int n = in.nextInt();

        for (int i = 0; i < 2; i++){

            byte arr1 = mass[1 + n][0][0];

            for (int j = 0; j < 2; j++){

                byte arr2 = mass

                for (int f = 0; f < 3; f++){

                    System.out.println(mass[i][j][f]);
                }
            }


        }

    }
}
