package org.math.projecteuler.problems;

/*
 * https://projecteuler.net/problem=6
 * "Sum square difference"
 */
public class Problem6 {

    public int sumSquareDifference(int max) {
        return getSquareOfSumTillMax(max) - getSumOfSquaresTillMax(max);
    }

    private int getSquareOfSumTillMax(int max) {
        int sumTillMax = getSumTillMax(max);
        return sumTillMax * sumTillMax;
    }

    private int getSumTillMax(int max) {
        // Use the formula for the sum of first n natural numbers: n * (n + 1) / 2
        return max * (max + 1) / 2;
    }

    private int getSumOfSquaresTillMax(int max) {
        int answer = 0;
        int i = 1;
        while (i <= max) {
            answer += i * i;
            i++;
        }
        return answer;
    }
}
