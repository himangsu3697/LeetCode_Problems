class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int product = 1;
        int count = 0; 
        for(int i=0; i<nums.length; i++) {
          if(nums[i] != 0) {
            product *= nums[i];
          } else {
            count++;
          }
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                res[i] = (count > 1) ? 0 :  product;
            } else {
                res[i] = (count > 0) ? 0 : product/nums[i];
            }
        } 
        return res;
    }
}