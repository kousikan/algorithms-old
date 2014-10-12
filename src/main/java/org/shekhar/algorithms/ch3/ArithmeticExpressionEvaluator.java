package org.shekhar.algorithms.ch3;

import java.util.Stack;
import java.util.stream.IntStream;

/**
 * Created by shekhargulati on 10/12/2014.
 */
public class ArithmeticExpressionEvaluator {

    public static double evaluate(String expression) {
        Stack<String> operands = new Stack<String>();
        Stack<Double> values = new Stack<Double>();
        int length = expression.length();
        for (int i = 0; i < length; i++) {
            String s = String.valueOf(expression.charAt(i));
            if (s.equals("(")) ;
            else if (s.equals("+")) operands.push(s);
            else if (s.equals("-")) operands.push(s);
            else if (s.equals("*")) operands.push(s);
            else if (s.equals("/")) operands.push(s);
            else if (s.equals(")")) {
                String operand = operands.pop();
                Double value = values.pop();
                if (operand.equals("+")) value = values.pop() + value;
                else if (operand.equals("-")) value = values.pop() - value;
                else if (operand.equals("*")) value = values.pop() * value;
                else if (operand.equals("/")) value = values.pop() / value;
                values.push(value);
            } else {
                values.push(Double.valueOf(s));
            }
        }
        return values.pop();
    }

    public static void main(String[] args) {
        String expression = "(1+((2+3)*(4*5)))";
        System.out.println(evaluate(expression));
    }
}
