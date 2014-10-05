package org.shekhar.algorithms.ch1.exercises;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_11 {

    public static void main(String[] args) {
        boolean[][] arr = {
                {true, false},
                {false, true}
        };

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                if (arr[i][j] == true) {
                    System.out.println(String.format("i %d j %d ", i, j) + "*");
                } else {
                    System.out.println(String.format("i %d j %d ", i, j) + " ");
                }
            }
        }
    }
}
