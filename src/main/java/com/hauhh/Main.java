package com.hauhh;

import static com.hauhh.Solution.lengthOfLongestSubstringKDistinct;

public class Main {
    public static void main(String[] args) {
        String[] input = {"abcabcbb", "bbbbb", "pwwkew"};

        System.out.println("Length of Longest Substring without repeating");

        for (String in : input) {
            System.out.printf(
                    "lengthOfLongestSubstringWithoutRepeating(\"%s\") = %d%n",
                    in,
                    Solution.lengthOfLongestSubstringWithoutRepeating(in)
            );
        }

        System.out.println();

        String[] input2 = {"eceba", "aa"};
        for (String in : input2) {
            for (int k = 1; k <= in.length(); k++) {
                System.out.printf(
                        "lengthOfLongestSubstringKDistinct(\"%s\", %d) = %d%n",
                        in,
                        k,
                        Solution.lengthOfLongestSubstringKDistinct(in, k));
            }
        }
    }


}