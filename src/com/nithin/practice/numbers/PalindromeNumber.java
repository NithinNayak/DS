package com.nithin.practice.numbers;

public class PalindromeNumber {
    public static void isPalindrome(int num){
        int result = 0;
        int temp = num;
        while(num > 0){
            int lastDigit = num % 10;
            result = (result * 10) + lastDigit;
            num /= 10;
        }
        System.out.println(temp == result);
    }
    public static void main(String[] args){
        isPalindrome(121);
    }
}
