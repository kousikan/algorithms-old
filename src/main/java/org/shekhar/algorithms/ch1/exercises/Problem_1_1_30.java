package org.shekhar.algorithms.ch1.exercises;

import java.util.Arrays;

/**
 * Created by shekhargulati on 10/5/2014.
 */
public class Problem_1_1_30 {

    public static boolean[][] matrix(int n) {
        boolean[][] arr = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = relativePrime(i, j) ? false : true;
            }
        }
        return arr;
    }

    private static boolean relativePrime(int i, int j) {
        int gcd = gcd(i, j);
        return gcd == 1 ? false : true;
    }

    private static int gcd(int i, int j) {
        if (j == 0) {
            return i;
        }
        int r = i % j;
        return gcd(j, r);
    }

    private static int[] factors(int number) {
        int[] factors = new int[number / 2 + 1];
        int j = 0;
        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                factors[j++] = i;
                factors[j++] = number / i;
            }
        }
        return Arrays.copyOf(factors, j);
    }

    public static void main(String[] args) {
        boolean[][] matrix = matrix(5);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
