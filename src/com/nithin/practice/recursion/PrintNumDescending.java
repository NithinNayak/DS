package com.nithin.practice.recursion;

public class PrintNumDescending {
    /**
     * Print N to 1 using Recursion
     */
    public static void printDescending(int i,int N){
        if(i>N) return;
        printDescending(i+1,N);
        System.out.println(i);
    }
    public static void main(String[] args){
        printDescending(1,5);
    }
}
