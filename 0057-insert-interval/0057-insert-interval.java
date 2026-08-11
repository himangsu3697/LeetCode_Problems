class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res = new int[intervals.length + 1][2];
        int idx = 0;
        int i = 0;
        while (i < intervals.length && newInterval[0] > intervals[i][1]) {
            res[idx++] = intervals[i++];
        }

        while (i < intervals.length && newInterval[1] >= intervals[i][0]) {
            if (intervals[i][0] < newInterval[0])
                newInterval[0] = intervals[i][0];
    
            if (intervals[i][1] > newInterval[1])
                newInterval[1] = intervals[i][1];

            i++;
        }
        res[idx++] = newInterval;
        while (i < intervals.length) {
            res[idx++] = intervals[i++];
        }
        return Arrays.copyOf(res, idx);
    }
}