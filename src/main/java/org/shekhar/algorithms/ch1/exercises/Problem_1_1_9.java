package org.shekhar.algorithms.ch1.exercises;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class Problem_1_1_9 {

    public static void main(String[] args) {
        int number = 100;
        String binaryRepresentation = "";
        while (number > 0) {
            binaryRepresentation = (number % 2) + binaryRepresentation;
            number = number / 2;
        }

        System.out.println(binaryRepresentation);
    }

}
