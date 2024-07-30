package com.nithin.practice.recursion;

public class ReverseArray {
    /**
     * You are given an array. The task is to reverse the array and print it.
     *
     * Example 1:
     * Input: N = 5, arr[] = {5,4,3,2,1}
     * Output: {1,2,3,4,5}
     */
    public static void reverse(int[] nums, int i, int N){
        if(i>=N/2) {
            for(int j = 0;j<nums.length; j++){
                System.out.println(nums[j]);
            }
            return;
        }
        int temp = nums[i];
        nums[i] = nums[N-i-1];
        nums[N-i-1] = temp;
        reverse(nums, i+1, N);
    }
    public static void main(String[] args){
        reverse(new int[]{1,2,3,4,5},0,5);
    }
}
