package com.hauhh;

public class Solution {

    // https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public static int lengthOfLongestSubstringWithoutRepeating(String s) {
        int[] map = new int[256];
        int max = 0;
        for(int i = 0, j = 0; i < s.length(); i++){
            map[s.charAt(i)]++;
            for(; map[s.charAt(i)] > 1; j++) map[s.charAt(j)]--;

            max = Math.max(max, i - j + 1);
        }
        return max;
    }


}
