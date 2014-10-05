package org.shekhar.algorithms.ch1.exercises;

import edu.princeton.cs.introcs.StdOut;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_7_3 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            System.out.println(i);
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }

        StdOut.println(sum);
    }
}
