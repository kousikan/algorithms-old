package org.shekhar.algorithms.ch3.excercises;

import org.shekhar.algorithms.ch3.Stack;
import org.shekhar.algorithms.ch3.Strings;

import java.util.Arrays;

/**
 * Created by shekhargulati on 10/13/2014.
 */
public class Problem_1_3_4 {

    public static void main(String[] args) {
        String[] expressions = {
                "{()}",
                "[()]{}{[()()]()}",
                "[(])"
        };

        for (String text : expressions) {
            boolean balancedExpression = isBalancedExpression(text);

            System.out.println(String.format("%s is balanced == %s", text, balancedExpression));
        }

    }

    private static boolean isBalancedExpression(String text) {
        Strings input = new Strings(text);
        Stack<String> stack = new Stack<>();

        for (String item : input) {
            if ("{[(".contains(item)) {
                stack.push(item);
            } else if ("}])".contains(item)) {
                String previousItem = stack.pop();
                String pair = previousItem + item;
                if (!isValidPair(pair)) {
                    stack.push(previousItem);
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isValidPair(String pair) {
        String[] pairs = {"{}", "[]", "()"};
        for (String validPair : pairs) {
            if (validPair.equals(pair)) {
                return true;
            }
        }
        return false;
    }
}
