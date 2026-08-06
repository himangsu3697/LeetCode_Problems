class Solution {
    public int smallestNumber(int n, int t) {
        if(t == 1) {
            return n;
        }
        int i = n;
        int p = 1;
        while(p%t != 0) {
            p = 1;
            int no = i;
            while(no != 0) {
                p *= no%10;
                no /= 10; 
            }
            i++;
        } 
        return i-1;
    }
}