package org.shekhar.algorithms.ch3.excercises;

import org.shekhar.algorithms.ch3.Stack;
import org.shekhar.algorithms.ch3.Strings;

/**
 * Created by shekhargulati on 10/14/2014.
 */
public class Problem_1_3_11 {

    public static double evaluatePostfixExpression(String postfix) {
        Stack<String> operands = new Stack<>();
        Stack<Double> values = new Stack<>();

        for (String token : Strings.iter(postfix)) {
            if (isOperand(token)) {
                operands.push(token);
            } else if (isLeftParenthesis(token)) {
                // skip
            } else if (isRightParenthesis(token)) {
                values.push(applyOperand(operands.pop(), values.pop(), values.pop()));
            } else {
                values.push(Double.valueOf(token));
            }
        }
        return values.pop();
    }

    private static boolean isLeftParenthesis(String token) {
        return token.equals("(");
    }

    private static Double applyOperand(String operand, Double last, Double secondLast) {
        switch (operand) {
            case "+":
                return secondLast + last;
            case "-":
                return secondLast - last;
            case "*":
                return secondLast * last;
            case "/":
                return secondLast / last;
        }
        throw new RuntimeException("Operator not found " + operand);
    }

    private static boolean isRightParenthesis(String token) {
        return token.equals(")");
    }

    private static boolean isOperand(String token) {
        return "+*-/".contains(token);
    }
}
