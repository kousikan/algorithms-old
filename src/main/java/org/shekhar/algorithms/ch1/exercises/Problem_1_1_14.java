package org.shekhar.algorithms.ch1.exercises;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_14 {

    public static int lg(int n) {
        int base = 10;
        int start = base;
        int exponent = 1;
        while (n > start) {
            start *= base;
            exponent++;
        }
        return exponent;
    }

    public static void main(String[] args) {
        System.out.println(lg(1000));
    }
}
