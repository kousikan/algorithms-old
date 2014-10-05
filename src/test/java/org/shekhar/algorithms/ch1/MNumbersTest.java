package org.shekhar.algorithms.ch1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MNumbersTest {

    @Test
    public void isPrime_68718952447_ReturnsTrue() throws Exception {
        long number = 68718952447L;
        long start = System.currentTimeMillis();
        boolean prime = MNumbers.isPrime(number);
        System.out.println(String.format("Time takes in %d seconds", (System.currentTimeMillis() - start) / 1000));
        assertTrue(prime);
    }

}