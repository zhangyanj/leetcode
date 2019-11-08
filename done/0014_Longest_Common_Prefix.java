class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        if (strs.length == 0) {
            return ans;
        }
        int minlen = getmin(strs);
        for (int i = 0; i < minlen; i++) {
            char temp = strs[0].charAt(i);
            for (String s:strs) {
                if (s.charAt(i)!=temp) {
                    return ans;
                }
            }
            ans+=temp;
        }
        return ans;
    }
    public int getmin(String[] strs) {
        int min=Integer.MAX_VALUE;
        for (String s:strs) {
            min = min<s.length()?min:s.length();
        }
        return min;
    }
}
