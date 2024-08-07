package com.nithin.practice.hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumber {
    /**
     * Example 1:
     * Input: arr[] = {10,5,10,15,10,5};
     * Output:
     *  10  3
     * 	 5  2
     *   15 1
     */
    private static void findFrequency(int[] arr){
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int val : arr){
            frequencyMap.put(val, frequencyMap.getOrDefault(val,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }
    public static void main(String[] args){
        findFrequency(new int[]{10,5,10,15,10,5});
    }
}
