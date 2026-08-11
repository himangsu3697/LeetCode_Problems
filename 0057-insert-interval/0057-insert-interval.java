import java.util.Arrays;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res = new int[intervals.length + 1][2];
        int idx = 0;
        int i = 0;

        // Intervals completely before newInterval
        while (i < intervals.length && newInterval[0] > intervals[i][1]) {
            res[idx++] = intervals[i++];
        }

        // Merge overlapping intervals
        while (i < intervals.length && newInterval[1] >= intervals[i][0]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        // Add merged interval
        res[idx++] = newInterval;

        // Add remaining intervals
        while (i < intervals.length) {
            res[idx++] = intervals[i++];
        }

        return Arrays.copyOf(res, idx);
    }
}