package arrays;

import org.jetbrains.annotations.NotNull;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
//        for (char c : s) {
//            System.out.print(c + " ");
//        }
    }

    public static void reverseString(@NotNull char[] s) {
        int temp;
        int left = 0, right = s.length - 1;
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = (char) temp;
            left++;
            right--;
        }
    }
}


/**
 * 344. Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */