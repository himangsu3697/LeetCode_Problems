class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int ci = i;
            int oi = nums[i] - 1;
            if(ci != oi) {
                if(nums[ci] == nums[oi]) {
                    return nums[ci];
                } else {
                    int temp = nums[ci];
                    nums[ci] = nums[oi];
                    nums[oi] = temp;
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}