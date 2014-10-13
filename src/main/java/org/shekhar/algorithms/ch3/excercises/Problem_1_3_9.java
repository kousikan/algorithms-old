package org.shekhar.algorithms.ch3.excercises;

import org.shekhar.algorithms.ch3.Stack;
import org.shekhar.algorithms.ch3.Strings;

/**
 * Created by shekhargulati on 10/13/2014.
 */
public class Problem_1_3_9 {

    public static String toInfixExpression(String expressionWithoutLeftParentheses) {
        Stack<String> expressions = new Stack<>();
        for (String term : Strings.iter(expressionWithoutLeftParentheses)) {
            if (!isRightParentheses(term)) {
                expressions.push(term);
            } else {
                String childExpression = toChildExpression(expressions, term);
                expressions.push(childExpression);
            }
        }
        String infixExpression = joinChildExpressions(expressions);
        return infixExpression;
    }

    private static boolean isRightParentheses(String term) {
        return term.equals(")");
    }

    private static String joinChildExpressions(Stack<String> stack) {
        String result = "";
        for (String item : stack) {
            result = item + result;
        }
        return result;
    }

    private static String toChildExpression(Stack<String> stack, String term) {
        String last = stack.pop();
        String secondLast = stack.pop();
        String thirdLast = stack.pop();
        return new StringBuilder("(").append(thirdLast).append(secondLast).append(last).append(term).toString();
    }

    public static void main(String[] args) {
        String expression = "1+2)*3-4)*5-6)))";
        System.out.println(toInfixExpression(expression));
    }


}
