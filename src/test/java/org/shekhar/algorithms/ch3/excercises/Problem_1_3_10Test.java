package org.shekhar.algorithms.ch3.excercises;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1_3_10Test {

    @Test
    public void infixToPostfix_ExpressionWithOneValue_ReturnsTheSameExpression() throws Exception {
        String infix = "1";
        String postfix = Problem_1_3_10.infixToPostfix(infix);
        assertThat(postfix, Is.is(IsEqual.equalTo(infix)));
    }

    @Test
    public void infixToPostfix_SimpleInfixExpression_ReturnsPostfixExpression() throws Exception {
        String infix = "(1+2)";
        String expectedPostfix = "(12+)";
        String actualPostfix = Problem_1_3_10.infixToPostfix(infix);
        assertThat(actualPostfix, Is.is(IsEqual.equalTo(expectedPostfix)));
    }

    @Test
    public void infixToPostfix_ComplexInfixExpression_ReturnsComplexPostfixExpression() throws Exception {
        String infix = "((1*(2+3))/4)";
        String expectedPostfix = "((1(23+)*)4/)";
        String actualPostfix = Problem_1_3_10.infixToPostfix(infix);
        assertThat(actualPostfix, Is.is(IsEqual.equalTo(expectedPostfix)));
    }
}