package org.shekhar.algorithms.ch2;

/**
 * Created by shekhargulati on 10/6/2014.
 */
public class StringUtils {

    public static boolean isPalindrome(String input) {
        input = input.trim().toLowerCase();
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt((length - 1) - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(String[] names) {
        for (int i = 1; i < names.length; i++) {
            if (names[i - 1].compareTo(names[i]) < 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new String[]{"a","b"}));
    }
}
