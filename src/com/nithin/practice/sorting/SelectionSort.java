package com.nithin.practice.sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args){
        selectionSort(new int[]{3,5,1,2,5,6,1});
    }
}
