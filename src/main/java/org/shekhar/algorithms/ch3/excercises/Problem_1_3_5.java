package org.shekhar.algorithms.ch3.excercises;

import org.shekhar.algorithms.ch3.Stack;

/**
 * Created by shekhargulati on 10/13/2014.
 */
public class Problem_1_3_5 {

    public static String valToBinary(int val) {
        StringBuilder binaryVal = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        while (val > 0) {
            stack.push(val % 2);
            val = val / 2;
        }

        for (Integer value : stack) {
            binaryVal.append(value);

        }
        return binaryVal.toString();
    }

    public static void main(String[] args) {
        System.out.println(valToBinary(50));
    }
}
