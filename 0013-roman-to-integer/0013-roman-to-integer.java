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
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            int curr = value(s.charAt(i));
            int next = value(s.charAt(i + 1));

            if (curr < next) {
                res -= curr;
            } else {
                res += curr;
            }
        }

        return res + value(s.charAt(n - 1));
    }
}