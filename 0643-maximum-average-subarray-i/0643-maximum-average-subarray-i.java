class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = k-1;
        int maxSum = 0;
        for(int idx = 0; idx < k; idx++) {
            maxSum += nums[idx];
        }
        int sum = maxSum;
        while(j < nums.length-1) {
            sum -= nums[i];
            sum += nums[j+1];
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }
        return (double)maxSum/k;
    }
}