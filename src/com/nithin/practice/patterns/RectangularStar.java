package com.nithin.practice.patterns;

public class RectangularStar {

    /**
     * Given an integer N, print the following pattern.
     *
     * Example 1:
     * Input: N = 3
     * Output:
           * * * *
           * * * *
           * * * *
     *
     *
     * Example 2:
     * Input: N = 6
     * Output:
          * * * * * * *
          * * * * * * *
          * * * * * * *
          * * * * * * *
          * * * * * * *
          * * * * * * *
     */

    public void printPatternOne(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printPatternTwo(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printPatternThree(int N){
        for(int i=0; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void printPatternFour(int N){
        for(int i=1;i<=N;i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void printPatternFive(int N){
        for(int i=1;i<=N;i++){
            for(int j=N; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printPatternSix(int N){
        for(int i=N; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static  void main(String[] args){
        RectangularStar rs = new RectangularStar();
        rs.printPatternOne(3);
        rs.printPatternTwo(3);
        rs.printPatternThree(3);
        rs.printPatternFour(5);
        rs.printPatternFive(5);
        rs.printPatternSix(5);
    }

}
