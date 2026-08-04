class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List <Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int n : nums) {
            if(max < n) {
                max = n;
            }
            if(min > n) {
                min = n;
            }
        }
        int arr[] = new int[max];
        for(int n : nums) {
            arr[n-1] = - 1;
        }
        for(int i=min-1; i<max; i++) {
            if(arr[i] != -1) {
                list.add(i+1);
            }
        }
        return list;
    }
}