package com.hauhh;

public class Solution {

    // https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public static int lengthOfLongestSubstringWithoutRepeating(String s) {
        int[] map = new int[256];
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
            for (; map[s.charAt(i)] > 1; j++) map[s.charAt(j)]--;

            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    // PREMIUM: https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] map = new int[256];
        int max = 0, cnt = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map[c]++;
            if (map[c] == 1) cnt++; //Update status using s[i]
            for (; cnt > k; j++) { // shrink the left edge while invalid
                c = s.charAt(j);
                map[c]--;
                if (map[c] == 0) cnt--; // update state using s[j]
            }
            max = Math.max(max, i - j + 1); // longest window so far
        }
        return max;
    }


}
