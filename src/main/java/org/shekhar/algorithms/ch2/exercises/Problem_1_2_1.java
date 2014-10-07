package org.shekhar.algorithms.ch2.exercises;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;

import java.util.Arrays;

/**
 * Created by shekhargulati on 10/7/2014.
 */
public class Problem_1_2_1 {

    public static void main(String[] args) {
        int N = 100000;
        Interval1D xInterval = new Interval1D(0, 1);
        Interval1D yInterval = new Interval1D(0, 1);
        Interval2D square = new Interval2D(xInterval, yInterval);
//        square.draw();
        Point2D[] pointsInSquare = new Point2D[N];
        int numberOfPointsInSquare = 0;
        for (int i = 0; i < N; i++) {
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x, y);
            pointsInSquare[numberOfPointsInSquare] = p;
            numberOfPointsInSquare++;
        }
        pointsInSquare = Arrays.copyOf(pointsInSquare, numberOfPointsInSquare);
        double closestDistanceBetweenPoints = Double.POSITIVE_INFINITY;
        long loopCounter = 0;
        for (int i = 0; i < pointsInSquare.length - 1; i++) {
            for (int j = i + 1; j < pointsInSquare.length; j++) {
                loopCounter++;
                double distance = pointsInSquare[i].distanceTo(pointsInSquare[j]);
                if (distance < closestDistanceBetweenPoints) {
                    closestDistanceBetweenPoints = distance;
                }
            }
        }

        System.out.println(String.format("Closed distance between points is %.5f", closestDistanceBetweenPoints));
        System.out.println("Loop counter " + loopCounter);
    }

}
