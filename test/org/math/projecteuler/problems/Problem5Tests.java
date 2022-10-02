package org.math.projecteuler.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem5Tests {
    Problem5 problem5;

    public Problem5Tests() {
        problem5 = new Problem5();
    }

    @Test
    public void GetAnswer_1to10_Passes() {
        int answer = problem5.smallestMultiple(1, 10);
        Assertions.assertEquals(2520, answer);
    }

    @Test
    public void GetAnswer_1to20_Passes() {
        int answer = problem5.smallestMultiple(1, 20);
        Assertions.assertEquals(232792560, answer);
    }
}
