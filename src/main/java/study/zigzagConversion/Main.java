package study.zigzagConversion;

public class Main {
    public static void main(String[] args) {
        System.out.println(  convert("PAYPALISHIRING", 3));
//        Input: s = "PAYPALISHIRING", numRows = 3
//        Output: "PAHNAPLSIIGYIR"
//        Output: "PAHNAPLSIIGYAHN"


//        P   A   H   N
//        A P L S I I G
//        Y   I   R
    }
    public static String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        for(int numRow = 0; numRow < numRows; numRow++) {
            boolean isTail = numRow == 0 || numRow == numRows-1;
            boolean isEnd = numRow == numRows-1;
            sb.append(convertRow(s, numRows, numRow, isTail, isEnd));
        }
        return sb.toString();
    }

    public static String convertRow(String s, int numRows, int numRow, boolean isTail, boolean isEnd){
        int numChar = isEnd ? numRows-1 : 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(numRow));
        while(numChar < s.length()) {
            numChar = numChar + (numRows * 2) - 2;
            if (isTail) {
                if (numChar < s.length()-1) {
                    sb.append(s.charAt(numChar));
                }
            } else {
                if (numChar - numRow <= s.length()-1) {
                    sb.append(s.charAt(numChar - numRow));
                }
                if (numChar + numRow <= s.length()-1) {
                    sb.append(s.charAt(numChar + numRow));
                }
            }
        }
        return sb.toString();
    }
}
