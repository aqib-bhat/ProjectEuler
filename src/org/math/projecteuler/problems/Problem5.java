package org.math.projecteuler.problems;

/*
 * https://projecteuler.net/problem=5
 * "Smallest multiple"
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {

    public int smallestMultiple(int min, int max) {
        int nextNum = min + 1;
        while (nextNum <= max) {
            min = getSmallestMultiple(min, nextNum);
            nextNum++;
        }
        return min;
    }

    private int getSmallestMultiple(int currentSmallestMultiple, int nextBiggerNumber) {
        int nextSmallestMultiple = currentSmallestMultiple;
        while (nextSmallestMultiple % nextBiggerNumber != 0) {
            nextSmallestMultiple += currentSmallestMultiple;
        }
        return nextSmallestMultiple;
    }
}
