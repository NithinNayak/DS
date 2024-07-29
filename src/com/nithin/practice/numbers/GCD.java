package com.nithin.practice.numbers;

public class GCD {
    public static void findGCD(int a, int b){
        while(a>0 && b>0){
            if(a>b)
                a = a % b;
            else
                b = b % a;
            if(a==0) {
                System.out.println(b);
                break;
            }
            if(b==0) {
                System.out.println(a);
                break;
            }
        }
    }

    public static void main(String[] args){
        findGCD(6,12);
    }
}
