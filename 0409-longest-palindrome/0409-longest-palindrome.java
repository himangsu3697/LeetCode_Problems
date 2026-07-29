import java.util.HashMap;
class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        int count = 0;
        boolean hasOdd = false;

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
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