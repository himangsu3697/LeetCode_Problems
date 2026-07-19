class Solution {
    public int strStr(String haystack, String needle) {
        int i=0,j=0,start=0;
        while(i < haystack.length() && j < needle.length()) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if(j == needle.length()) {
                    return i-j;
                }
            } else {
                j=0;
                i = ++start;
            }
        }
        return -1;
    }
}