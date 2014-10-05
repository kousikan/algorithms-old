package org.shekhar.algorithms.ch1.exercises;

import java.util.Arrays;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_15 {

    public static int[] histogram(int[] arr, int m) {
        int[] output = new int[m];

        for (int i = 0; i < arr.length; i++) {
            output[arr[i]] += 1;
        }

        return output;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 2, 4};
        int[] histogram = histogram(input, 6);
        System.out.printf("histogram : %s", Arrays.toString(histogram));
    }
}
