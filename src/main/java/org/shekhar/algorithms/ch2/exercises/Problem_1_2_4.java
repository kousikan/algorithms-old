package org.shekhar.algorithms.ch2.exercises;

/**
 * Created by shekhargulati on 10/7/2014.
 */
public class Problem_1_2_4 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1;

        str1 = "world";

        System.out.println(str1);
        System.out.println(str2);
    }
}
