import java.util.Stack;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> st = new Stack<>(); // stores the index of the next highest temperature 
        int res[] = new int[temperatures.length];
        for(int i=temperatures.length-1; i>=0; i--) {
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                res[i] = 0;
            } else {
                res[i] = st.peek() - i;
            }
            st.push(i);
        } 
        return res;
    }
}