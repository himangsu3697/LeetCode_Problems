class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = k-1;
        int MaxSum = 0;
        for(int idx = 0; idx < k; idx++) {
            MaxSum += nums[idx];
        }
        int sum = MaxSum;
        while(j < nums.length-1) {
            sum -= nums[i];
            sum += nums[j+1];
            MaxSum = Math.max(MaxSum, sum);
            i++;
            j++;
        }
        return (double)MaxSum/k;
    }
}