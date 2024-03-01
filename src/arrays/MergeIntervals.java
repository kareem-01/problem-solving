package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{1, 5}, {0, 4}, {3, 10}, {2, 5}})));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(c -> c[0]));
        for (int[] interval : intervals) {
        }
        return intervals;
    }
}
