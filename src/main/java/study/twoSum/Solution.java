package study.twoSum;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int count = 0;
        while (count < nums.length) {
            System.out.println("Loop number: " + count);
            int firstNumber = nums[count];
            for (int i = 0; i < nums.length; i++) {
                if (count == i) {
                    continue;
                }
                int secondNumber = nums[i];
                if (firstNumber + secondNumber == target) {
                    System.out.println("firstNumber = " + firstNumber);
                    System.out.println("secondNumber = " + secondNumber);
                    System.out.println(firstNumber + " + " + secondNumber + " = " + Integer.sum(firstNumber, secondNumber));
                    return new int[]{count, i};
                }
            }
            count++;
        }
        System.out.println("Answer not found");
        return null;
    }
}