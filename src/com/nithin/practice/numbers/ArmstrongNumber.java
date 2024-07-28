package com.nithin.practice.numbers;

public class ArmstrongNumber {
    /**
     * Given an integer N, return true it is an Armstrong number otherwise return false.
     *
     * An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
     *
     * Example 1:
     * Input:N = 153
     * Output:True
     * Explanation: 13+53+33 = 1 + 125 + 27 = 153
     */

    private static void isArmstrongNumber(int num){
        int temp = num;
        int res = 0;
        while(num > 0){
            int lastDigit = num % 10;
            num = num / 10;
            res = res + (lastDigit*lastDigit*lastDigit);
        }
        System.out.println(temp == res);
    }

    public static void main(String[] args){
        isArmstrongNumber(153);
    }
}
