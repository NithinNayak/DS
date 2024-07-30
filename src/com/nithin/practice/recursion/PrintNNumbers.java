package com.nithin.practice.recursion;

public class PrintNNumbers {
    private static int cnt = 1;
    public static void print(int N){
        if(cnt>N) return;
        System.out.print(cnt+" ");
        cnt++;
        print(N);
    }
    public static void main(String[] args){
        print(2);
    }
}
