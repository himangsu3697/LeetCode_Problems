class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder str = new StringBuilder(goal+goal);
        return str.indexOf(s) != -1;
    }
}