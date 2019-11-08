class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<Integer> set = new HashSet<Integer>();
        for (String i:wordDict) {
            set.add(i.length());
        }
        int len = s.length();
        boolean[] dp = new boolean[len];
        // if (wordDict.contains(s.substring(0, 1))) {
        //     dp[0] = false;
        // }
        for (int i = 0; i < len; i++) {
            for (int j:set) {
                if (i+j>len) {
                    continue;
                }
                if (i == 0) {
                    if (wordDict.contains(s.substring(i, i+j))) {
                        dp[i+j-1] = true;
                    }
                } else {
                    if (wordDict.contains(s.substring(i, i+j))&&dp[i-1]) {
                        dp[i+j-1] = true;
                    }
                }
                
            }
        }
        return dp[len-1];
    }
}
