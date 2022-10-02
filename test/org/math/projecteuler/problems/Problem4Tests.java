package org.math.projecteuler.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem4Tests {
    Problem4 problem4;

    public Problem4Tests() {
        problem4 = new Problem4();
    }

    @Test
    public void GetAnswer_2Digits_Passes() {
        int answer = problem4.largestPalindromeProduct(2);
        Assertions.assertEquals(9009, answer);
    }

    @Test
    public void GetAnswer_3Digits_Passes() {
        int answer = problem4.largestPalindromeProduct(3);
        Assertions.assertEquals(906609, answer);
    }
}
