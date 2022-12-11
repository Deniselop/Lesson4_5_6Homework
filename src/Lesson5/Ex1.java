package Lesson5;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {


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



        for (int i = 0; i < mass.length; i++){
            for (int k = 0; k < mass[i].length; k++){
                for (int f = 0; f < mass[i][k].length; f++){
                    mass[i][k][f] += 1;
                }
            }
        }

        System.out.println(Arrays.deepToString(mass));

    }
}
