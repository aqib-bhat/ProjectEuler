package org.math.projecteuler.problems;

import org.math.projecteuler.common.StringHelper;

public class Problem4 {

    /*
     * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public int largestPalindromeProduct(int numOfDigits) {
        int boundary = getLargestNDigitNum(numOfDigits);
        int maxPalindromeProduct = boundary;
        int currentProduct;
        for (int i = 1; i <= boundary; i++) {
            for (int j = 1; j <= boundary; j++) {
                currentProduct = i * j;
                if (StringHelper.isPalindrome(String.valueOf(currentProduct))) {
                    maxPalindromeProduct = Math.max(currentProduct, maxPalindromeProduct);
                }
            }
        }
        return maxPalindromeProduct;
    }

    private int getLargestNDigitNum(int numOfDigits) {
        StringBuilder sb = new StringBuilder();
        while (numOfDigits > 0) {
            sb.append("9");
            numOfDigits--;
        }
        return Integer.parseInt(sb.toString());
    }
}
