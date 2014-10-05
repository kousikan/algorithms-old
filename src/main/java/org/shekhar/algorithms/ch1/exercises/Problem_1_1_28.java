package org.shekhar.algorithms.ch1.exercises;

import edu.princeton.cs.introcs.In;

import java.util.Arrays;

/**
 * Created by shekhargulati on 10/5/2014.
 */
public class Problem_1_1_28 {

    // Create an array with all unique elements
    public static int[] removeDuplicates(int[] A) {
        if (A.length < 2)
            return A;

        int j = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[j]) {
                j++;
                A[j] = A[i];
            }
        }

        int[] B = Arrays.copyOf(A, j + 1);

        return B;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
}
