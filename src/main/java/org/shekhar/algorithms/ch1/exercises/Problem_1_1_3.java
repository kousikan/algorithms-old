package org.shekhar.algorithms.ch1.exercises;

import edu.princeton.cs.introcs.StdIn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_3 {

    public static void main(String[] args) throws IOException {
        int[] numbers = new int[3];
        int i = 0;
        while (!StdIn.isEmpty()) {
            numbers[i] = StdIn.readInt();
            i++;
        }
        System.out.println((numbers[0] == numbers[1] && numbers[1] == numbers[2]) ? true : false);
    }
}
