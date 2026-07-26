class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = {-1, -1};

        int low = 0, high = nums.length - 1;
        while(low < nums.length && nums[low] != target) {
            low++;
        }

        while(high >= 0 && nums[high] != target) {
            high--;
        }
        if(low > high) {
            return range;
        }
        range[0] = low;
        range[1] = high;
        return range;
    }
}