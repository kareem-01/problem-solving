package arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int i;
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        for (i = 0; nums[i] < target; i++) {
        }
        return i;
    }
}

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 *<p>
 * Example 1:
 *<p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *<p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *<p>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
