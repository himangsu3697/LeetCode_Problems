class Solution {
    public int[] productExceptSelf(int[] nums) {
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
                nums[i] = (count > 1) ? 0 :  product;
            } else {
                nums[i] = (count > 0) ? 0 : product/nums[i];
            }
        } 
        return nums;
    }
}

/* 
preix and ssuffix solution
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Prefix product
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }

        // Suffix product
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }
}
*/