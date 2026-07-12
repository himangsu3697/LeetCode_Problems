class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i < nums.length) {
            if(nums[i] != 0) {
                int ci = i;
                int oi = nums[i]-1;
                if(ci != oi) {
                    nums[ci] = nums[ci] + nums[oi];
                    nums[oi] = nums[ci] - nums[oi];
                    nums[ci] = nums[ci] - nums[oi];
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }

        for(i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                return i+1;
            }
        }
        return 0;
    }
}