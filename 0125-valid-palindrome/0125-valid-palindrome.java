class Solution {
    public boolean isPalindrome(String s) {
        int sidx = 0, eidx = s.length()-1;
        while(sidx < eidx) {
            if(Character.isLetterOrDigit(s.charAt(sidx)) && Character.isLetterOrDigit(s.charAt(eidx))) {
                if(Character.toLowerCase(s.charAt(sidx)) == Character.toLowerCase(s.charAt(eidx))) {
                    sidx++;
                    eidx--;
                } else {
                    return false;
                }
            } else {
                if(!Character.isLetterOrDigit(s.charAt(sidx))) {
                    sidx++;
                }
                if(!Character.isLetterOrDigit(s.charAt(eidx))) {
                    eidx--;
                }
            }
        }
        return true;
    }
}