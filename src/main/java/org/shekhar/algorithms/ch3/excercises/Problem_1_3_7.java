package org.shekhar.algorithms.ch3.excercises;

import org.shekhar.algorithms.ch3.Stack;

/**
 * Created by shekhargulati on 10/13/2014.
 */
public class Problem_1_3_7 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack.peek());
    }
}
