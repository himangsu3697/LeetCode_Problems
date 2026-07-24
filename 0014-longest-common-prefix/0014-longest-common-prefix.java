class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prifix = strs[0];
        for(int i=1; i<strs.length; i++) {
            while(!strs[i].startsWith(prifix)) {
                if(!prifix.isEmpty()) {
                    prifix = prifix.substring(0,prifix.length() - 1);
                } else {
                    return "";
                }
            }
        }
        return prifix;
    }
}