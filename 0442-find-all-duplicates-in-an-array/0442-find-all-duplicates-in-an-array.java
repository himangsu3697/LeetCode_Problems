class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(arr[nums[i] - 1] == -1) {
                list.add(nums[i]);
            } else {
                arr[nums[i] -1] = -1;
            }
        }
        return list;
    }
}