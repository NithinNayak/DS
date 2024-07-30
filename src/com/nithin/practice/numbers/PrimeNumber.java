package com.nithin.practice.numbers;

public class PrimeNumber {
    /**
     * Given an integer N, check whether it is prime or not. A prime number is a number that is
     * only divisible by 1 and itself and the total number of divisors is 2.
     *
     * Example 1:
     * Input:N = 2
     * Output:True
     */

    public static boolean isPrimeNumber(int number){
        int i = 1;
        while(i<=Math.sqrt(number)){
            if(number % i == 0 && i!= number){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPrimeNumber(9));
    }
}
