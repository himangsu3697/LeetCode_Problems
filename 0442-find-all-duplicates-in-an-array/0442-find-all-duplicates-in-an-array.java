class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                int ci = i;
                int oi = nums[i] - 1;
                if (ci != oi) {
                    if (nums[ci] == nums[oi]) {
                        list.add(nums[ci]);
                        nums[ci] = 0;
                    } else {
                        int temp = nums[ci];
                        nums[ci] = nums[oi];
                        nums[oi] = temp;
                    }
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        return list;
    }
}