class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            //skip the same first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[low] + nums[high] + nums[i];
                if (sum == 0) {
                    //skip same low element
                    while (low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    //skip same high element
                    while (low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }
                    res.add(List.of(nums[i], nums[low], nums[high]));
                    low++;
                    high--;

                } else if (sum > 0) {
                    high--;
                } 
                else {
                    low++;
                }
            }
        }
        return res;
    }
}