package study.recursion;

import java.util.Arrays;

public class Sum {

    public static void main(String[] args) {
//        int[] ints = {};
//        int[] ints = {6};
//        int[] ints = {6, 9};
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(ints));
//        System.out.println("Sum: " + sum(ints, 1));
        System.out.println("Max: " + maxNum(ints, 0, 1));
    }

    public static int sum(int[] ints, int count) {
        System.out.println("number of function calls " + count);
        if (ints.length == 0) {
            return 0;
        }
        if (ints.length == 1) {
            return ints[0];
        }
        return ints[0] + sum(Arrays.copyOfRange(ints, 1, ints.length), ++count);
    }

    public static int maxNum(int[] ints, int currentMax, int count) {
        System.out.println("number of function calls " + count);
        if (ints.length == 0) {
            return currentMax;
        }
        if (ints.length == 1) {
            return ints[0];
        }
        Math.max(ints[0], currentMax);
        return maxNum(Arrays.copyOfRange(ints, 1, ints.length), Math.max(ints[0], currentMax), ++count);
    }
}
