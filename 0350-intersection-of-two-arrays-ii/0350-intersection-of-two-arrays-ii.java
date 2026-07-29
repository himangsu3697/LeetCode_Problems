import java.util.HashMap;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         HashMap <Integer, Integer> map = new HashMap<>();
        int res[] = new int[nums1.length];
        int idx = 0;
        if(nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        for(int i : nums1) {
           map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i : nums2) {
            if(map.containsKey(i)) {
                res[idx++] = i;
                if(map.get(i) == 1) {
                    map.remove(i);
                } else {
                    map.put(i, map.get(i) - 1);
                }
            }
        }
        return Arrays.copyOf(res,idx);
    }
}