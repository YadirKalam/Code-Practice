package codeLearn;

import java.util.HashSet;

//Find the longest substring with non-repeating character.
//abcabcbb
//bbbbb
//pwwkew
import java.util.HashMap;

public class SubString {
    public static String longestSubstring(String s) {
        int left = 0, maxLength = 0, startIdx = 0;
        HashMap<Character, Integer> seen = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (seen.containsKey(currentChar)) {
                left = Math.max(left, seen.get(currentChar) + 1); 
            }
            seen.put(currentChar, right);

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIdx = left;
            }
        }
        return s.substring(startIdx, startIdx + maxLength);
    }

    public static void main(String[] args) {
        String input = "pwwkew";
        System.out.println("Longest substring: " + longestSubstring(input));
    }
}

