package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }


    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (int i : nums) {
            if (!hash.add(i)) {
                return true;
            }
        }
        return false;
    }
}
