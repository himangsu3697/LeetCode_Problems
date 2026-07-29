import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();
        int res[] = new int[nums1.length];
        int idx = 0;
        if(nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }
        for(int i : nums1) {
            set.add(i);
        }
        for(int i : nums2) {
            if(set.contains(i)) {
                res[idx++] = i;
                set.remove(i);
            }
        }
        return Arrays.copyOf(res,idx);
    }
}