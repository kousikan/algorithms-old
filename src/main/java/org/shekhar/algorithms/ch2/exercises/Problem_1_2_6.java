package org.shekhar.algorithms.ch2.exercises;

/**
 * Created by shekhargulati on 10/7/2014.
 */
public class Problem_1_2_6 {

    public static boolean isCircularRotation(String str1, String str2) {
        int totalRun = 0;
        while (totalRun < str1.length()) {
            str1 = str1.substring(1) + str1.substring(0, 1);
            if (str1.equals(str2)) {
                return true;
            }
            totalRun++;

        }

        return false;
    }

    public static boolean isCircularRotation2(String str1, String str2) {
        return (str1.length() == str2.length()) && (str1 + str1).contains(str2);
    }

    public static void main(String[] args) {
        System.out.println(isCircularRotation2("ABCDEF", "CDEFAB"));
    }
}
