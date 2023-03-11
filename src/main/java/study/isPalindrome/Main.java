package study.isPalindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        boolean isNegative = x < 0;
        String strX = String.valueOf(Math.abs(x));
        return isPalindrome(isNegative ? "-" + strX : strX);

    }

    public static boolean isPalindrome(String s){
        int length = s.length();
        if (length == 1 || length == 0) {
            return true;
        }

        if (s.charAt(0) != s.charAt(length - 1)){
            return false;
        }

        return isPalindrome(s.substring(1, length - 1));
    }
}
