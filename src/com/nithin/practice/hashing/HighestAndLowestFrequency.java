package com.nithin.practice.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestFrequency {
    public static void handLFrequency(int[] arr){
        int hCount=0,lCount=Integer.MAX_VALUE,hNum=0,lNum = 0;
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i : arr){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entrySet : freqMap.entrySet()){
            if(entrySet.getValue() > hCount){
                hCount = entrySet.getValue();
                hNum = entrySet.getKey();
            }
            if(entrySet.getValue() < lCount){
                lCount = entrySet.getValue();
                lNum = entrySet.getKey();
            }
        }
        System.out.println("Number with lowest frequency is "+lNum+" with count "+lCount);
        System.out.println("Number is highest frequency is "+hNum+" with count "+hCount);
    }
    public static void main(String[] args){
        handLFrequency(new int[]{2,3,4,4,4,1});
    }
}
