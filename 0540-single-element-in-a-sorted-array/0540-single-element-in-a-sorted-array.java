class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Boundary
            if (mid == 0 && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if (mid == nums.length - 1 && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }

            // Single element
            if (nums[mid] != nums[mid - 1] &&
                nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // mid is the second element of a pair
            if (nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 1) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            // mid is the first element of a pair
            else {
                if (mid % 2 == 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}