package org.shekhar.algorithms.ch1.exercises;

/**
 * Created by shekhargulati on 10/5/2014.
 */
public class Problem_1_1_29 {

    public static int rank(int key, int[] a) {
        int index = rankIndex(key, a);
        return index == -1 ? 0 : index;
    }

    public static int rankIndex(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static int count(int key, int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5, 7};
        System.out.println(rank(5, a));
        System.out.println(count(5, a));
    }
}
