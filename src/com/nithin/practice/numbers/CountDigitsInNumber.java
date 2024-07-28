package com.nithin.practice.numbers;

public class CountDigitsInNumber {
    /**
     * Problem Statement: Given an integer N, return the number of digits in N.
     *
     * Example 1:
     * Input:N = 12345
     * Output:5
     * Explanation:  The number 12345 has 5 digits.
     */
    public static void countDigitsInANumber(int number){
        System.out.println((int)Math.log10(number)+1);
    }

    public static void main(String[] args){
        countDigitsInANumber(12345);
    }
}
