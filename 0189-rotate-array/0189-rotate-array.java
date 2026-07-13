class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k == 0) {
            return;
        }
        int prev,curr,next,count=0;
        for(int i=0; count < nums.length; i++) {
           prev = nums[i];
           curr = i;
          do{
            next = (curr+k)%nums.length;
            int temp = nums[next];
            nums[next] = prev;
            prev = temp;
            curr = next;
            count++;
           } while(curr != i);  
        }
        
    }
}