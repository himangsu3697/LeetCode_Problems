class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length < 3) {
            if (nums.length == 2 && nums[0] < nums[1]) {
                return 1;
            } else {
                return 0;
            }
        }
        int i = 1;
        for (; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        if (nums[i - 1] < nums[i] && i == nums.length - 1) {
            return i;
        }
        return 0;
    }
}