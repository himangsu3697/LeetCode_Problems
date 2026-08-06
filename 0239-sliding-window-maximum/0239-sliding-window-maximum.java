import java.util.ArrayDeque;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque <Integer> q = new ArrayDeque<>();
        int max[] = new int[nums.length - (k - 1)];
        int idx = 0;
        for(int i=0; i<nums.length; i++) {
            while(!q.isEmpty() && q.peekFirst() <= i-k) {
                q.removeFirst();
            }

            while(!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {
                q.removeLast();
            }

            q.addLast(i);

            if(i >= k-1) {
                max[idx++] = nums[q.peekFirst()];
            }
        }
        return max;
    }
}