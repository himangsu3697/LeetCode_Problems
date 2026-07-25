import java.util.ArrayList;
class Solution {
    public int maxProduct(int n) {
        ArrayList <Integer> list = new ArrayList<>();
        while(n != 0) {
            list.add(n%10);
            n /= 10;
        }
        int max1 = list.get(0), max2 = 0;
        for(int i=1; i<list.size(); i++) {
            if(max1 < list.get(i)) {
                max2 = max1;
                max1 = list.get(i);
            } else {
                if(max2 < list.get(i)) {
                    max2 = list.get(i);
                }
            }
        }

        return max1 * max2;
    }
}