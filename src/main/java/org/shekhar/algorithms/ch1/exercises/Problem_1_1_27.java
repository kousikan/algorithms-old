package org.shekhar.algorithms.ch1.exercises;

/**
 * Created by shekhargulati on 10/5/2014.
 */
public class Problem_1_1_27 {

    private static double[][] cache = new double[101][51];

    public static double binomial(int N, int k) {
        if ((N == 0) || (k <= 0) || k > N - 1) return 1;
        if(cache[N] != null && cache[N][k] != 0){
            return cache[N][k];
        }
        int previous = N - 1;
        double binomial1 = binomial(previous, k);
        double binomial2 = binomial(previous, k - 1);
        cache[previous][k] = binomial1;
        cache[previous][k - 1] = binomial2;
        System.out.println(String.format("binomial(%d,%d) %.2f binomial(%d,%d) %.2f", previous, k, binomial1, previous, (k - 1), binomial2));
        return binomial1 + binomial2;
    }

    public static void main(String[] args) {
        System.out.println(binomial(100, 50));

    }
}
