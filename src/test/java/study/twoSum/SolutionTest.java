package study.twoSum;

import junit.framework.TestCase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class SolutionTest extends TestCase {


    @ParameterizedTest
    @CsvSource(value = {"2,7,11,15:9", "3,2,4:6", "3,3:6"}, delimiter = ':')
    public void testTwoSum(String s, String target) {
        String[] split = s.split(",");
        int[] nums = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, Integer.parseInt(target))));
    }

}