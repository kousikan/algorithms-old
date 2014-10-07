package org.shekhar.algorithms.ch2.exercises;

/**
 * Created by shekhargulati on 10/8/2014.
 */
public class Problem_1_2_19 {
    public static void main(String[] args) {
        String str = "Turing 5/22/1939 11.99";
        String[] parts = str.split("\\s+");
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);
    }
}
