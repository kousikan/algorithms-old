package org.shekhar.algorithms.ch1.exercises;

import edu.princeton.cs.introcs.StdOut;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_7_1 {

    public static void main(String[] args) {

        double t = 9.0;
        while (Math.abs(t - 9 / t) > 0.01) {
            t = (9.0 / t + t) / 2.0;
        }

        StdOut.printf("%.5f\n", t);
    }
}
