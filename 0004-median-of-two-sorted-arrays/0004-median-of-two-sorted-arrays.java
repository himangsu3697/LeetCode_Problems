class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length + nums2.length];
        int idx = 0;
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                res[idx++] = nums1[i++];
            } else {
                res[idx++] = nums2[j++];
            }
        } 
        while(i < nums1.length) {
            res[idx++] = nums1[i++];
        }
        
        while(j < nums2.length) {
            res[idx++] = nums2[j++];
        }

        if(idx%2 == 0) {
            return (double) (res[idx/2] + res[idx/2-1]) / 2;
        } else {
            return (double) res[idx/2];
        }
    }
}