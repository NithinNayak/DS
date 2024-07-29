package com.nithin.practice.numbers;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AllDivisors {
    /**
     * Problem Statement: Given an integer N, return all divisors of N.
     *
     * A divisor of an integer N is a positive integer that divides N without leaving a remainder.
     * In other words, if N is divisible by another integer without any remainder, then that integer
     * is considered a divisor of N.
     *
     * Example 1:
     * Input:N = 36
     * Output:[1, 2, 3, 4, 6, 9, 12, 18, 36]
     */

    public static void printAllDivisors(int num){
        int i = 1;
        Set<Integer> result = new TreeSet<>();
        while(i<=Math.sqrt(num)){
            if(num % i == 0){
                result.add(i);
                if(i != (num/i)){
                    result.add(num/i);
                }
            }
            i++;
        }
        System.out.println(result);
    }

    public static void main(String[] args){
        printAllDivisors(4);
    }
}
