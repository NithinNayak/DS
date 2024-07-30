package com.nithin.practice.recursion;

public class PrintNameNTimes {
    private static void print(int i, int N){
        if(i>N) return;
        System.out.println("Nithin");
        print(i+1, N);
    }
    public static void main(String[] args){
        //Print name 5 times
        print(1,5);
    }
}
