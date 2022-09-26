package org.math.projecteuler.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem2Tests {
    Problem2 problem2;

    public Problem2Tests() {
        problem2 = new Problem2();
    }

    @Test
    public void GetAnswer_10_Passes() {
        int answer = problem2.sumOfEvenFibsTillLimit(10);
        Assertions.assertEquals(10, answer);
    }

    @Test
    public void GetAnswer_4Mil_Passes() {
        int answer = problem2.sumOfEvenFibsTillLimit(4 * 1000 * 1000);
        Assertions.assertEquals(4613732, answer);
    }
}
