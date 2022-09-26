package org.math.projecteuler.problems;

import org.math.projecteuler.common.MathChecksHelper;

import java.math.BigInteger;

public class Problem3 {

    /*
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143 ?
     */
    public BigInteger largestPrimeFactor(BigInteger num) {
        BigInteger largestPrimeFactor = MathChecksHelper.BIG_INTEGER_2;
        BigInteger divisor = BigInteger.valueOf(3);
        while (num.compareTo(MathChecksHelper.BIG_INTEGER_1) != 0) {
            if (num.mod(divisor).compareTo(MathChecksHelper.BIG_INTEGER_0) == 0 && MathChecksHelper.isPrime(divisor)) {
                largestPrimeFactor = divisor;
                num = num.divide(largestPrimeFactor);
            }
            divisor = divisor.add(MathChecksHelper.BIG_INTEGER_2);
        }
        return largestPrimeFactor;
    }

}
