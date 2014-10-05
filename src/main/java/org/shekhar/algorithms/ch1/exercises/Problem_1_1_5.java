package org.shekhar.algorithms.ch1.exercises;

import edu.princeton.cs.introcs.StdIn;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_5 {


    public static void main(String[] args) {
        double x = 1.0000001;
        double y = 0.99;

        System.out.println((inRange(x) && inRange(y)) ? true : false);
    }

    private static boolean inRange(double value) {
        return value > 0.0d && value < 1.0;
    }
}
