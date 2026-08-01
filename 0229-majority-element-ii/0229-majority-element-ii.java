import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int limit = nums.length / 3;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > limit) {
                list.add(e.getKey());
            }
        }

        return list;
    }
}