package org.shekhar.algorithms.ch3.excercises;

import org.shekhar.algorithms.ch3.Stack;

/**
 * Created by shekhargulati on 10/13/2014.
 */
public class Problem_1_3_2 {

    public static void main(String[] args) {
        String input = "it was - the best - of times - - - it was - the - -";
        Stack<String> stack = new Stack<>();
        for (String item : input.split("\\s")) {
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }

        }

    }
}
