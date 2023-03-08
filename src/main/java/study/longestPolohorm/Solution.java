package study.longestPolohorm;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()){
            return "";
        }
        int len = s.length();
        int max = 1;
        int start = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                if (j - i > max && isPalindrome(s.substring(i, j))){
                    max = j - i;
                    start = i;
                }
            }
        }
        return s.substring(start, start + max);
    }

    private static boolean isPalindrome(String s){
        if (s == null) return false;
        if (s.length() < 2) return true;

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

}
