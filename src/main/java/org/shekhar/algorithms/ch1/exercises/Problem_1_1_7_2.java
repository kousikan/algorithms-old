package org.shekhar.algorithms.ch1.exercises;

import edu.princeton.cs.introcs.StdOut;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_7_2 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);

    }
}
