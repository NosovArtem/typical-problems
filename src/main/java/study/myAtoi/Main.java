package study.myAtoi;

public class Main {
    public static void main(String[] args) {
        System.out.println(myAtoi("    -123"));
    }

    public static int myAtoi(String s){
        int rez = 0;
        boolean isNegative = s.contains("-");
        String str = s
                .replaceAll("_", "")
                .replaceAll("-", "")
                .replaceAll("[a-zA-Z]", "")
                .replaceAll(" ", "");
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            int a = (int)c - (int)'0';
            rez = rez +  a * (int)Math.pow(10, n-i-1);
        }
        if (isNegative) {
            rez = -rez;
        }
        System.out.println(rez);
        return rez;
    }

}


