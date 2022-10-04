package org.math.projecteuler.problems;

import org.math.projecteuler.common.MathChecksHelper;

import java.math.BigInteger;

/*
 * https://projecteuler.net/problem=7
 * "10001st prime"
 */
public class Problem7 {

    public BigInteger getNthPrime(int n) {
        if (n == 1) {
            return MathChecksHelper.BIG_INTEGER_2;
        }
        int nextN = 2;
        BigInteger currentPrime = BigInteger.valueOf(3);
        while (nextN < n) {
            currentPrime = getNextPrime(currentPrime);
            nextN++;
        }
        return currentPrime;
    }

    private BigInteger getNextPrime(BigInteger currentPrime) {
        BigInteger nextNum = currentPrime;
        while (true) {
            nextNum = nextNum.add(MathChecksHelper.BIG_INTEGER_2);
            if (MathChecksHelper.isPrime(nextNum)) {
                return nextNum;
            }
        }
    }
}
