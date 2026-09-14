class Solution {
    public boolean isVowel(char s) {
        s = Character.toLowerCase(s);
        switch(s) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            return true;
            default :
            return false;
        }
    }
    public String reverseVowels(String s) {
        int low = 0, high = s.length() - 1;
        char arr[] = s.toCharArray();
        while(low < high) {
            if(isVowel(arr[low]) && isVowel(arr[high])) {
                char temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
                low++;
            } else if(isVowel(arr[low])) {
                high--;
            } else {
                low++;
            }
        }
        return new String(arr);
    }
}