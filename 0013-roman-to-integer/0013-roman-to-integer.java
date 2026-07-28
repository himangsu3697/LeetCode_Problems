class Solution {
    public int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int res = 0;
        int curr, next;
        for (int i=0; i<s.length()-1; i++) {
            curr = value(s.charAt(i));
            next = value(s.charAt(i+1));
            if (curr >= next) {
                res += curr;
            } else {
                res -= curr;
            }
        }
        res += value(s.charAt(s.length() - 1));
        return res;
    }
}