package Lesson5;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {

        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                array[i][0] = "W";
            }else{
                array[i][0] = "B";
            }
            for (int k = 1; k < array[i].length; k++){
                if (array[i][k - 1] == "W"){
                   array[i][k] = "B";
                }else{
                    array[i][k] = "W";
                }
            }
        }



        System.out.println(Arrays.deepToString(array));
    }
}
