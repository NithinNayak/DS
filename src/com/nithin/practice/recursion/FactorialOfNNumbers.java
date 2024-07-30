package com.nithin.practice.recursion;

public class FactorialOfNNumbers {
    /**
     * Given a number X,  print its factorial.
     * Example 1:
     * Input: X = 5
     * Output: 120
     * Explanation: 5! = 5*4*3*2*1
     */
    public static int factorial(int N){
        if(N == 0) return 1;
        return N*factorial(N-1);
    }
    public static void main(String[] args){
        System.out.print(factorial(5));
    }
}
