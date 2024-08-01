package com.nithin.practice.recursion;

public class FibonacciNumber {
    /**
     * Given an integer N. Print Nth term.
     * <p>
     * Example 1:
     * Input: N = 4
     * Output: 3
     *
     * @return
     */
    public static int fibonacci(int N){
        if(N<=1) return N;
        return fibonacci(N-1) + fibonacci(N-2);
    }

    public static void main(String[] args){

        System.out.println(fibonacci(4));
    }
}
