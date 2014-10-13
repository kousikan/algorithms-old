package org.shekhar.algorithms.ch3.excercises;

import org.shekhar.algorithms.ch3.ResizingArrayStack;

/**
 * Created by shekhargulati on 10/13/2014.
 */
public class Problem_1_3_8 {

    public static void main(String[] args) {
        String input = "it was - the best - iter times - - - it was - the - -";
        ResizingArrayStack<String> stack = new ResizingArrayStack<>();
        for (String val : input.split("\\s")) {
            if(!val.equals("-")){
                stack.push(val);
            }else if(!stack.isEmpty()){
                System.out.print(stack.pop() + " ");
            }
        }
        System.out.println();
        System.out.println(stack.arraySize());
    }
}
