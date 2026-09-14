class Solution {

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i'|| c == 'o' || c == 'u';
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            while (low < high && !isVowel(arr[low])) {
                low++;
            }

            while (low < high && !isVowel(arr[high])) {
                high--;
            }

            if (low < high) {
                char temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }

        return new String(arr);
    }
}