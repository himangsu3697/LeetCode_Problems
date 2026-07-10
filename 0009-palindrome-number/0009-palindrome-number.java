class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        if(x < 0 || ((x % 10) == 0 && x != 0)) {
            return false;
        } else {
           while(x > rev) {
              rev = (rev*10) + (x%10);
              x /= 10;
           }
           return x == rev || x == rev / 10;
        }
    }
}