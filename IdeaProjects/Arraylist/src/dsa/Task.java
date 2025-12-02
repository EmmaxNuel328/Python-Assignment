package dsa;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        boolean isSquare = false;
        int[][] array = {
                {2, 3,4, 4},
                {5, 6, 4,3},
                {8, 9, 10,3},
                {12, 13, 14,12},
        };
        for (int row = 0; row < array.length; row++) {
            if (array.length != array[row].length){
                isSquare = false;
                break;
            }
            else{
                isSquare = true;
        }
        }
        System.out.println(isSquare);


    }
}