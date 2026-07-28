class Solution {
    public int missingNumber(int[] nums) {
        int i=0,current;
        while(i < nums.length) {
            current = nums[i];
            if(current < nums.length && current != nums[current]) {
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
            } else {
                i++;
            }           
        }

        for(i=0; i<nums.length; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}