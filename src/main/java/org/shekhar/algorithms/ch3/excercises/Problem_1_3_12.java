package org.shekhar.algorithms.ch3.excercises;

import org.shekhar.algorithms.ch3.Stack;

/**
 * Created by shekhargulati on 10/15/2014.
 */
public class Problem_1_3_12 {

    public static <T> Stack<T> copy(Stack<T> stack) {
        Stack<T> anotherCopy = reverseStack(reverseStack(stack));
        return anotherCopy;
    }

    private static <T> Stack<T> reverseStack(Stack<T> stack) {
        Stack<T> copyStack = new Stack<>();
        for (T item : stack) {
            copyStack.push(item);
        }
        return copyStack;
    }
}
