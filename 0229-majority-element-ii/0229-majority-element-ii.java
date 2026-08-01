import java.util.HashMap;
import java.util.List;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        List <Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        for(int num : map.keySet()){
            if(map.get(num) >= n/3+1) {
                list.add(num);
            }
        }
        return list;
    }
}