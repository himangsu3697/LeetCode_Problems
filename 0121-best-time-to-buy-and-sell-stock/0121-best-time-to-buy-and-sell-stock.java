class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;
        for(int i=1; i < prices.length; i++) {
            if(minBuy > prices[i]) {
                minBuy = prices[i];
            } else {
              if((prices[i] - minBuy) > maxProfit) {
                 maxProfit = (prices[i] - minBuy);
              }
            }
        }
        return maxProfit;
    }
}