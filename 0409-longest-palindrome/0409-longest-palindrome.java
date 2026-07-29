import java.util.HashMap;
class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        int count = 0;
        boolean hasOdd = false;
        for(int  i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i),1);
            }
        }
        for(int val : map.values()) {
            if(val%2 == 0) {
                count += val;
            } else {
                count += (val-1);
                hasOdd = true;
            }
        }
        if(hasOdd)  {
            count++;
        }
        return count;
    }
}