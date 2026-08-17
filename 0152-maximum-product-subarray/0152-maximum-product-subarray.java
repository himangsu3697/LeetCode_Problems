class Solution {
    public int maxProduct(int[] nums) {
        int preffixMax = Integer.MIN_VALUE;
        int suffixMax = Integer.MIN_VALUE;
        int preffix = 1, suffix = 1;
        //calculate suffix max
        for(int i=0; i<nums.length; i++) {
            preffix *= nums[i];
            preffixMax = Math.max(preffixMax, preffix);
            if(preffix == 0) {
                preffix = 1;
            }
        }
        //calculate suffix max
        for(int i=nums.length-1; i>=0; i--) {
            suffix *= nums[i];
            suffixMax = Math.max(suffixMax, suffix);
            if(suffix == 0) {
                suffix = 1;
            }
        }
        return Math.max(preffixMax, suffixMax);
    }
}