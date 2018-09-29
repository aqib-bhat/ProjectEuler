package org.math.projecteuler;

/*
* Problem statement: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class Problem1Solution1{

    public static void main(String []args){
        Problem1Solution1 p1s1 = new Problem1Solution1();
        System.out.println("The sum of the multiples of 3 and 5 below 1000 is: " + p1s1.sumMultiples3and5(1000));
    }
     
    private int sumMultiples3and5(int boundary) {
        int total = 0;
        for (int i = 3; i < boundary;) {
            if (i % 5 != 0) {
                total = total + i;
            }
            i = i + 3;
        }
        for (int j = 5; j < boundary;) {
            total += j;
            j += 5;
        }
        return total;
    }
}
