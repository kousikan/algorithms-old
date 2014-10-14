package org.shekhar.algorithms.ch3.excercises;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.shekhar.algorithms.ch3.Stack;

import static org.junit.Assert.*;

public class Problem_1_3_12Test {

    @Test
    public void copy_StackOfStrings_ReturnANewStackOfStringWithSameElements() throws Exception {
        Stack<String> names = new Stack<>();
        names.push("shekhar");
        names.push("sameer");
        names.push("rahul");
        Stack<String> stackCopy = Problem_1_3_12.copy(names);
        assertThat(stackCopy.pop(), Is.is(IsEqual.equalTo("rahul")));
        assertThat(stackCopy.pop(), Is.is(IsEqual.equalTo("sameer")));
        assertThat(stackCopy.pop(), Is.is(IsEqual.equalTo("shekhar")));
    }
}