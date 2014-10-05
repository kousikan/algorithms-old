package org.shekhar.algorithms.ch1.exercises;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_20 {

    private static long[] cache = new long[101];

    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int lg(long n) {
        double base = 2.718281828d;
        double start = base;
        int exponent = 1;
        while (n > start) {
            start *= base;
            exponent++;
        }
        return exponent;
    }

    public static void main(String[] args) {
        System.out.println(lg(factorial(20)));
    }
}
