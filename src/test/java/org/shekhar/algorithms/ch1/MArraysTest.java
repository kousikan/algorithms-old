package org.shekhar.algorithms.ch1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MArraysTest {

    @Test
    public void max_ArrayWithValues1To5_MaxIs5() throws Exception {
        int max = MArrays.max(new int[]{1, 2, 3, 4, 5});
        assertEquals(5, max);
    }

    @Test
    public void max_EmptyArray_ReturnsMinusOne() throws Exception {
        int[] arr = {};
        int max = MArrays.max(arr);
        assertEquals(-1, max);
    }

    @Test
    public void max_ArrayWithNegativeValues_MaxIsSmallestNegativeValue() throws Exception {
        int[] arr = {-1, -2, -3, -4, -5};
        int max = MArrays.max(arr);
        assertEquals(-1, max);

    }

    @Test
    public void avg_InputArrayWith1To3_Returns2() throws Exception {
        double[] arr = {1, 2, 3};
        double avg = MArrays.avg(arr);
        assertEquals(2d, avg, 0.01d);
    }

    @Test
    public void copy_ArrayWithValues1To3_ReturnsANewArrayWithValues1To3() throws Exception {
        int[] arr = {1, 2, 3};
        int[] anotherArray = MArrays.copy(arr);
        assertArrayEquals(arr, anotherArray);
    }

    @Test
    public void copy_EmptyArray_ReturnsEmptyArray() throws Exception {
        int[] arr = {};
        int[] anotherArr = MArrays.copy(arr);
        assertArrayEquals(arr, anotherArr);
    }

    @Test
    public void reverse_EmptyArray_ReturnsEmptyArray() throws Exception {
        int[] arr = {};
        int[] anotherArr = MArrays.reverse(arr);
        assertArrayEquals(arr, anotherArr);
    }

    @Test
    public void reverse_ArrayWithValues1To3_ReturnsArrayWithValues3To1() throws Exception {
        int[] arr = {1, 2, 3};
        int[] reverseArray = MArrays.reverse(arr);
        assertArrayEquals(new int[]{3, 2, 1}, reverseArray);
    }

    @Test
    public void matrixMultiplication_TwoArrays_OneArray() throws Exception {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        int[][] c = MArrays.matrixMultiplication(a, b);

        assertArrayEquals(new int[]{19, 22}, c[0]);
        assertArrayEquals(new int[]{43, 50}, c[1]);

    }
}