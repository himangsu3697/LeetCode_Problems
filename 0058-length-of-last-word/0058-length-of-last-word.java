class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String lastWord = s.substring(s.lastIndexOf(" ")+1, s.length());
        return lastWord.length();
    }
}