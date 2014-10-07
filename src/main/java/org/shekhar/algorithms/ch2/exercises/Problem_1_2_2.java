package org.shekhar.algorithms.ch2.exercises;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;

/**
 * Created by shekhargulati on 10/7/2014.
 */
public class Problem_1_2_2 {

    public static void main(String[] args) {
        int N = 10;
        Interval1D[] intervals = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            double x = Math.random();
            if (x > 0.5) {
                x = x - 0.5;
            }
            double y = Math.random();
            if (y < 0.5) {
                y = y + 0.5;
            }
            intervals[i] = new Interval1D(x, y);
        }

        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                boolean intersects = intervals[i].intersects(intervals[j]);
                if (intersects) {
                    System.out.println(String.format("%s intersects %s", intervals[i], intervals[j]));
                }
            }
        }
    }
}
