class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = k-1;
        int sum = 0;
        for(int idx = 0; idx < k; idx++) {
            sum += nums[idx];
        }
        double MaxAvg = (double) sum/k;
        while(j < nums.length-1) {
            sum -= nums[i];
            sum += nums[j+1];
            MaxAvg = Math.max(MaxAvg,(double) sum/k);
            i++;
            j++;
        }
        return MaxAvg;
    }
}