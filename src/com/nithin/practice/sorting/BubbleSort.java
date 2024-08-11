package com.nithin.practice.sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            int didSwap = 0;
            for(int j=0;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args){
        bubbleSort(new int[]{2,3,1,0,9});
    }
}
