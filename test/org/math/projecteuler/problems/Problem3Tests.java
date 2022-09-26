package org.math.projecteuler.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class Problem3Tests {
    Problem3 problem3;

    public Problem3Tests() {
        problem3 = new Problem3();
    }

    @Test
    public void GetAnswer_13195_Passes() {
        BigInteger bigInteger = new BigInteger("13195");
        BigInteger answer = problem3.largestPrimeFactor(bigInteger);
        BigInteger expectedAnswer = new BigInteger("29");
        Assertions.assertEquals(expectedAnswer, answer);
    }

    @Test
    public void GetAnswer_600851475143_Passes() {
        BigInteger bigInteger = new BigInteger("600851475143");
        BigInteger answer = problem3.largestPrimeFactor(bigInteger);
        BigInteger expectedAnswer = new BigInteger("6857");
        Assertions.assertEquals(expectedAnswer, answer);
    }
}
