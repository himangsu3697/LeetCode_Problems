import java.util.ArrayDeque;
class Solution {
    public int[] finalPrices(int[] prices) {
        ArrayDeque <Integer> st = new ArrayDeque<>();
        int res[] = new int[prices.length];
        for(int i=prices.length-1; i>=0; i--) {
            while(!st.isEmpty() && st.peek() > prices[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                res[i] = prices[i];
            } else {
                res[i] = prices[i] - st.peek();
            }
            st.push(prices[i]);
        }
        return res;
    }
}