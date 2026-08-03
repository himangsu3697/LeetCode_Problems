import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(int v : map.values()) {
            if(v >= 2) {
                return true;
            }
        }
        return false;
    }
}