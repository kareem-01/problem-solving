package arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        moveZeroes(new int[]{1, 0, 1});

    }

    public static void moveZeroes(int[] nums) {
        int j = 0, k;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (k = j; k < nums.length; k++) {
            nums[k] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
