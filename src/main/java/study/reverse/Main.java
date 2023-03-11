package study.reverse;

public class Main {
    public static void main(String[] args) {
        int x = -123;
        //Input: x = 123
        //Output: 321
        boolean isNegative = x < 0;
        String s = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        String str = stringBuilder.toString();
        int i = Integer.parseInt(str.replaceAll("-", ""));
        if (isNegative){
            i = -i;
        }
        System.out.println(i);

    }
}
