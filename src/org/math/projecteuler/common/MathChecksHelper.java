package org.math.projecteuler.common;

import java.math.BigInteger;

public class MathChecksHelper {

    public static final BigInteger BIG_INTEGER_0 = BigInteger.valueOf(0);
    public static final BigInteger BIG_INTEGER_1 = BigInteger.valueOf(1);
    public static final BigInteger BIG_INTEGER_2 = BigInteger.valueOf(2);

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPrime(BigInteger bigInteger) {
        System.out.println("Inside isPrime, bigInteger: " + bigInteger);
        if (bigInteger.compareTo(BIG_INTEGER_2) < 0) {
            return false;
        }
        if (bigInteger.compareTo(BIG_INTEGER_2) == 0) {
            return true;
        }
        BigInteger divisor = BigInteger.valueOf(3);
        BigInteger halfOfNum = bigInteger.divide(BIG_INTEGER_2);
        while (divisor.compareTo(halfOfNum) < 0) {
            if (bigInteger.mod(divisor).compareTo(BIG_INTEGER_0) == 0) {
                return false;
            }
            divisor = divisor.add(BIG_INTEGER_2);
        }
        return true;
    }
}
