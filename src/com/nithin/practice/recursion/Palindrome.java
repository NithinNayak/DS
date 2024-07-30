package com.nithin.practice.recursion;

public class Palindrome {
    /**
     * "Given a string, check if the string is palindrome or not."
     * A string is said to be palindrome if the reverse of the string is the same as the string.
     *
     * Example 1:
     * Input: Str =  “ABCDCBA”
     * Output: Palindrome
     */
    public static boolean checkIfPalindrome(String str, int i){
        if(i>=str.length()/2) return true;

        if(str.charAt(i) != str.charAt(str.length() - i -1)) return false;

        return checkIfPalindrome(str, i+1);
    }
    public static void main(String[] args){
        System.out.print(checkIfPalindrome("NITHIN",0));
    }
}
