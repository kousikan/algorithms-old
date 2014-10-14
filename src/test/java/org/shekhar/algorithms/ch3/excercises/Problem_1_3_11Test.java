package org.shekhar.algorithms.ch3.excercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1_3_11Test {

    @Test
    public void evaluatePostfixExpression_0AsExpression_Return0() throws Exception {
        String postfix = "0";
        double actualValue = Problem_1_3_11.evaluatePostfixExpression(postfix);
        double expected = 0.0;
        assertEquals(expected, actualValue, 0.0001d);
    }

    @Test
    public void evaluatePostfixExpression_SimpleExpression_Evaluate() throws Exception {
        String postfix = "(12+)";
        double actual = Problem_1_3_11.evaluatePostfixExpression(postfix);
        assertEquals(3.0, actual, 0.00001d);
    }

    @Test
    public void evaluatePostfixExpression_ComplexExpression_Evaluate() throws Exception {
        String postfix = "((1(23+)*)4/)";
        double actual = Problem_1_3_11.evaluatePostfixExpression(postfix);
        assertEquals(1.25d, actual, 0.00001d);

    }
}