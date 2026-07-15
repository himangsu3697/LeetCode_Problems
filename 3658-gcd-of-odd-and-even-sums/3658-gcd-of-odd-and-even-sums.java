class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0, evenSum = 0;
        int odd = 1, even = 2;
        for(int i=1; i<=n; i++) {
            oddSum += odd;
            evenSum += even;
            odd+=2;
            even+=2;
        }
        while(evenSum != 0){
            int r = (oddSum % evenSum);
            oddSum = evenSum;
            evenSum = r;
        }
        return oddSum;
    }
}