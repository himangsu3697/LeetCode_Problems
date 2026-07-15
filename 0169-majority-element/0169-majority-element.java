class Solution {
    public int majorityElement(int[] nums) {
        int maj=0;;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            int count = 0;
            int val = nums[i];
            for(int j=0; j<n; j++) {
                if(nums[j] == val) {
                    count++;
                }
            }
            if(count > (n/2)) {
                maj=val;
                break;
            }
        }
        return maj;
    }
}