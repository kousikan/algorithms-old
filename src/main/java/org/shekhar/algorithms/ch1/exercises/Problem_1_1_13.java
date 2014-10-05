package org.shekhar.algorithms.ch1.exercises;

import java.util.Arrays;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_13 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transposedMatrix = transpose(matrix);

        System.out.println(Arrays.toString(transposedMatrix[0]));
        System.out.println(Arrays.toString(transposedMatrix[1]));
        System.out.println(Arrays.toString(transposedMatrix[2]));


    }

    private static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposedMatrix = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}
