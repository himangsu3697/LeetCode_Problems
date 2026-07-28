class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int currSum = nums[0];
        for(int i=1; i<n; i++) {
            currSum += nums[i];
        }
        return (n*(n+1)/2) - currSum;
    }
}