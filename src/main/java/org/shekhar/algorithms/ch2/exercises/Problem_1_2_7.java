package org.shekhar.algorithms.ch2.exercises;

/**
 * Created by shekhargulati on 10/7/2014.
 */
public class Problem_1_2_7 {

    public static String reverse(String s){
        int N = s.length();
        if(N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return reverse(b) + reverse(a);
    }

    public static void main(String[] args) {
        System.out.println(reverse("shekhar"));
    }
}
