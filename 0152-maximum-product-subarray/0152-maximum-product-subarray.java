class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int product = nums[0];
        for(int i=1; i<nums.length; i++) {
           int temp = maxProduct; 
           maxProduct = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i]));
           minProduct = Math.min(nums[i], Math.min(temp * nums[i], minProduct * nums[i]));
           product = Math.max(product,maxProduct);
        }
        return product;
    }
}