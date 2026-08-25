class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Integer.MIN_VALUE;
        for (int n : piles) {
            if (high < n) {
                high = n;
            }
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totleHours = 0;
            for (int n : piles) {
                totleHours += ((long) n + mid-1) / mid;
                if(totleHours > h) {
                    break;
                }
            }
            if (totleHours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}