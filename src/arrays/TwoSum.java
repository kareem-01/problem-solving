package arrays;

import java.util.Arrays;
import java.util.Hashtable;

public class TwoSum {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums = {0,4,3,0};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }


//    public static int[] twoSum(int[] nums, int target) {
//        int[] filtered = Arrays.stream(nums).filter(x -> x <= target).toArray();
//        for (int i = 0; i < filtered.length; i++) {
//            for (int j = i + 1; j < filtered.length; j++) {
//                if (filtered[i] + filtered[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{}; // return empty array if no solution
//    }

    public static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> hash = new Hashtable<>();
        for(int i = 0 ; i<nums.length ; i++){
            int complement = target - nums[i];
            if(hash.containsKey(complement)){
                return new int[]{hash.get(complement),i};
            }
            hash.put(nums[i],i);

        }
        return new int[]{};
    }
}