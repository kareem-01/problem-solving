package arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1}));
    }

    public static int missingNumber(int[] nums) {
        int sum;
        sum = (nums.length * (nums.length + 1)) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * <p>
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,0,1]
 * Output: 2
 * Example 2:
 * <p>
 * Input: nums = [0,1]
 * Output: 2
 * Example 3:
 * <p>
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Example 4:
 * <p>
 * Input: nums = [0]
 * Output: 1
 */
