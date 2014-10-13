package org.shekhar.algorithms.ch1.exercises;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;

        for (int i = 0; i <= 15; i++) {
            System.out.println(String.format("f %d g %d", f, g));
            int f1 = f;
            f = f + g; // previous value iter f + previous value iter g
            g = f1;// previous value iter f
        }
    }

}
