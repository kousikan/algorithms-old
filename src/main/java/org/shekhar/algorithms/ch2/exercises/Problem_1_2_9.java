package org.shekhar.algorithms.ch2.exercises;

/**
 * Created by shekhargulati on 10/8/2014.
 */
public class Problem_1_2_9 {

    public static int rank(int[] arr, int key) {
        int hi = arr.length;
        int lo = 0;
        while (hi > lo) {
            int mid = (hi + lo) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 9};
        System.out.println(rank(arr, 100));
    }
}
