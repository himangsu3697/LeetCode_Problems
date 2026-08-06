import java.util.Stack;
import java.util.HashMap;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> st = new Stack<>(); // stores the index of the next highest temperature 
        HashMap <Integer, Integer> map = new HashMap<>(); // stores the index and the no of days to get a warmer temperature
        int res[] = new int[temperatures.length];
        for(int i=temperatures.length-1; i>=0; i--) {
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                map.put(i, 0);
            } else {
                map.put(i, st.peek() - i);
            }
            st.push(i);
        } 
        for(int i=0; i<res.length; i++) {
            res[i] = map.get(i);
        }
        return res;
    }
}