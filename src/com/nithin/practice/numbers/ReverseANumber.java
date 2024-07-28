package com.nithin.practice.numbers;

public class ReverseANumber {
    /**
     * Given an integer N return the reverse of the given number.
     * Example 1:
     * Input:N = 12345
     * Output:54321
     */
    public static void reverseANumber(int number){
        int result = 0;
        while(number > 0){
            int lastDigit = number % 10;
            result = (result*10) + lastDigit;
            number = number / 10;
        }
        System.out.println(result);
    }

    public static void main(String[] args){
        reverseANumber(123001);
    }
}
