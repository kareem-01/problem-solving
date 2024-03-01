package arrays;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1}));
    }

    public static int singleNumber(int[] nums) {
//        int i, j = 1;
//        Arrays.sort(nums);
//        for (i = 0; j < nums.length; j += 2, i += 2) {
//            if (nums[i] != nums[j])
//                break;
//        }
//        return nums[i];

        int xor=0;

        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }

        return xor;
    }
}
