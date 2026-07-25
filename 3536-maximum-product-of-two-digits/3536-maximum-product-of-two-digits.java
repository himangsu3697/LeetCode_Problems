class Solution {
    public int maxProduct(int n) {
        int max1 = 0, max2 = 0, r;
        while(n != 0) {
            r = n%10;
            if(max1 < r) {
                max2 = max1;
                max1 = r;
            } else {
                if(max2 < r) {
                    max2 = r;
                }
            }
            n /= 10;
        }

        return max1 * max2;
    }
}