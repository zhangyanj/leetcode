class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        char[] arr = s.toCharArray();
        int len = arr.length;
        // int[] dp = new int[len];
        // dp[0] = 1;
        int pre = 0;
        int ans = 0;
        int minnum = -1;
        int presameindex = -1;
        for (int i = 0; i < len; i++) {
            if (map.containsKey((int)arr[i])) {
                presameindex = map.get((int)arr[i]);   
            } else {
                presameindex = -1;
            }
            minnum = Math.max(presameindex+1, pre);
            pre = minnum;
            map.put((int)arr[i], i);
            if (ans < i - minnum + 1) {
                ans = i - minnum + 1;
            }
        }
        return ans;
    }
}
