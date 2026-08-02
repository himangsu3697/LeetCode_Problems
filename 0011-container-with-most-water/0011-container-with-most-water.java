class Solution {
    public int maxArea(int[] height) {
        int left  = 0, right = height.length - 1;
        int maxWater = 0, water = 0;
        while(left  < right) {
            int ht = Math.min(height[left], height[right]);
            int wd = right - left;
            water = (ht * wd);
            maxWater = Math.max(maxWater, water);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}