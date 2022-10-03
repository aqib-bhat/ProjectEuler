package org.math.projecteuler.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem6Tests {
    Problem6 problem6;

    public Problem6Tests() {
        problem6 = new Problem6();
    }

    @Test
    public void GetAnswer_First10_Passes() {
        int answer = problem6.sumSquareDifference(10);
        Assertions.assertEquals(2640, answer);
    }

    @Test
    public void GetAnswer_First100_Passes() {
        int answer = problem6.sumSquareDifference(100);
        Assertions.assertEquals(25164150, answer);
    }
}
