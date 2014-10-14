package org.shekhar.algorithms.ch3.excercises;

import org.shekhar.algorithms.ch3.Stack;
import org.shekhar.algorithms.ch3.Strings;

/**
 * Created by shekhargulati on 10/14/2014.
 */
public class Problem_1_3_10 {

    public static String infixToPostfix(String infix) {
        Stack<String> operands = new Stack<>();
        Stack<String> values = new Stack<>();
        for (String token : Strings.iter(infix)) {
            if (isOperand(token)) {
                operands.push(token);
            } else if (isRightParenthesis(token)) {
                String childPostfixExpression = childPostfixExpression(operands, values, token);
                values.push(childPostfixExpression);
            } else {
                values.push(token);
            }
        }
        return values.pop();
    }

    private static String childPostfixExpression(Stack<String> operands, Stack<String> values, String token) {
        String last = values.pop();
        String secondLast = values.pop();
        String thirdLast = values.pop();
        return thirdLast + secondLast + last + operands.pop() + token;
    }

    private static boolean isRightParenthesis(String token) {
        return token.equals(")");
    }

    private static boolean isOperand(String token) {
        return "+*-/".contains(token);
    }
}
