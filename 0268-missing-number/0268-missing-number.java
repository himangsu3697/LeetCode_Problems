class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int origSum = n*(n+1)/2;
        int currSum = nums[0];
        for(int i=1; i<n; i++) {
            currSum += nums[i];
        }
        return origSum - currSum;
    }
}