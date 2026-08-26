class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0, high = 0;

        // low = maximum weight
        // high = total weight
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int day = 1;
            int sum = 0;

            for (int w : weights) {

                if (sum + w > mid) {
                    day++;
                    sum = 0;
                }

                sum += w;
            }

            if (day <= days) {
                high = mid - 1;   // capacity can be smaller
            } else {
                low = mid + 1;    // capacity needs to be bigger
            }
        }

        return low;
    }
}