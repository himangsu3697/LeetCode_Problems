class Solution {
    public char findTheDifference(String s, String t) {
        int res = 0;
        for(char val : s.toCharArray()) {
            res ^= val;
        }

        for(char val : t.toCharArray()) {
            res ^= val;
        }
        return (char)res;
    }
}