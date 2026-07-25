class Solution {
    public boolean rotateString(String s, String goal) {
        String str = goal + goal;
        return str.contains(s);
    }
}