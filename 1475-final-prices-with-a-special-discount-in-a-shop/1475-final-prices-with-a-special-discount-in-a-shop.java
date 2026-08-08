import java.util.ArrayDeque;
class Solution {
    public int[] finalPrices(int[] prices) {
        ArrayDeque <Integer> st = new ArrayDeque<>();
        for(int i=prices.length-1; i>=0; i--) {
            int price = prices[i];
            while(!st.isEmpty() && st.peek() > prices[i]) {
                st.pop();
            }
            if(!st.isEmpty()) {
                prices[i] = price - st.peek();
            }
            st.push(price);
        }
        return prices;
    }
}