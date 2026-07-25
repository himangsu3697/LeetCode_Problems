class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) return 0;

        for (int start = 0; start <= haystack.length() - needle.length(); start++) {

            int j = 0;

            while (j < needle.length() &&
                   haystack.charAt(start + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return start;
            }
        }

        return -1;
    }
}