package org.math.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem1Tests {
    Problem1 problem1;

    public Problem1Tests() {
        problem1 = new Problem1();
    }

    @Test
    public void GetAnswer_10_Passes() {
        int answer = problem1.sumMultiples3and5TillBoundary(10);
        Assertions.assertEquals(23, answer);
    }

    @Test
    public void GetAnswer_1000_Passes() {
        int answer = problem1.sumMultiples3and5TillBoundary(1000);
        Assertions.assertEquals(233168, answer);
    }
}
