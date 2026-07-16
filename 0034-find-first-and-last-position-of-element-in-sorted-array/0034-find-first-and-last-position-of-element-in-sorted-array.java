class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = {-1, -1};

        int low = 0, high = nums.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target)
                break;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (low > high)
            return range;
        int i = mid, j = mid;
        while (i > 0 && nums[i - 1] == target)
            i--;

        while (j < nums.length - 1 && nums[j + 1] == target)
            j++;

        range[0] = i;
        range[1] = j;

        return range;
    }
}