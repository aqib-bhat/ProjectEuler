package org.math.projecteuler.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class Problem7Tests {
    Problem7 problem7;

    public Problem7Tests() {
        problem7 = new Problem7();
    }

    @Test
    public void GetAnswer_6thPrime_Passes() {
        BigInteger answer = problem7.getNthPrime(6);
        Assertions.assertEquals(BigInteger.valueOf(13), answer);
    }

    @Test
    public void GetAnswer_10001stPrime_Passes() {
        BigInteger answer = problem7.getNthPrime(10001);
        Assertions.assertEquals(BigInteger.valueOf(104743), answer);
    }
}
