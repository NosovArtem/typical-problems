package study.longestSubstringWithoutRepeatingCharacters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        return max(s, 0);
    }

    public int max(String s, int max) {
        if (s.length() == 1 || s.length() == 0) {
            return Math.max(max, s.length());
        }
        String[] split = s.split("");
        Set hashSet = new HashSet<>(Arrays.asList(split));
        if (hashSet.size() == s.length()) {
            System.out.println(s);
            return Math.max(max, s.length());
        }

        Set<String> characters = new HashSet<>();
        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            if (characters.contains(s1)) {
                int x = s.indexOf(s1) + 1;
                max = Math.max(characters.size(), max);
                return max(s.substring(x), max);
            } else {
                characters.add(s1);
            }
        }
        return 0;
    }
}