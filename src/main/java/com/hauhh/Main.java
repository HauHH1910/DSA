package com.hauhh;

public class Main {
    public static void main(String[] args) {
        String[] input = {"abcabcbb", "bbbbb", "pwwkew" };

        System.out.println("Length of Longest Substring without repeating");

        for (String in : input) {
            System.out.printf(
                    "lengthOfLongestSubstringWithoutRepeating(\"%s\") = %d%n",
                    in,
                    Solution.lengthOfLongestSubstringWithoutRepeating(in)
            );
        }

        System.out.println();


    }


}