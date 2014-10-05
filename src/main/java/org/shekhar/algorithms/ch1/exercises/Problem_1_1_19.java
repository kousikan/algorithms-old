package org.shekhar.algorithms.ch1.exercises;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_19 {

    private static long[] cache = null;

    public static long fibonacci(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (cache[n] > 0) return cache[n];
        long result = fibonacci(n - 1) + fibonacci(n - 2);
        cache[n] = result;
        return result;
    }

    public static void main(String[] args) {
        cache = new long[101];
        for (int i = 92; i < 93; i++) {
            long start = System.currentTimeMillis();
            System.out.println(String.format("for i %d fibonacci number is %d. It took %d seconds", i, fibonacci(i), (System.currentTimeMillis() - start) / 1000));
        }
    }
}
