class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int res[][] = new int[intervals.length][2];
        int idx = 0;
        res[0] = intervals[0];
        for(int i=1; i<intervals.length; i++) {
            if(res[idx][1] >= intervals[i][0]) {
                res[idx][1] = Math.max(res[idx][1], intervals[i][1]);
            }  
            else {
                res[++idx] = intervals[i];
            }
        }
        return Arrays.copyOf(res, idx+1);
    }
}