class Solution {
    public boolean isPalindrome(int x) {
        String s= x+"";
        int len = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < len/2; i++) {
            if (arr[i] != arr[len-1-i]) {
                return false;
            }
        }
        return true;
    }
}

