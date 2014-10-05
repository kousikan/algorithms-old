package org.shekhar.algorithms.ch1;

/**
 * Created by shekhargulati on 10/4/2014.
 */
public class MNumbers {

    public static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
