package com.nithin.practice.recursion;

public class SumOfNNaturalNumbers {
    /**
     * Given a number ‘N’, find out the sum of the first N natural numbers.
     *
     * Example 1:
     * Input: N=5
     * Output: 15
     * Explanation: 1+2+3+4+5=15
     */
    public static int sum(int N){
        if(N == 0) return 0;
        return N +sum(N-1);
    }
    public static void main(String[] args){
        System.out.print(sum(5));
    }
}
