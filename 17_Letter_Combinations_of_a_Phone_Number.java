class Solution {
    public List<String> letterCombinations(String digits) {
        int len = digits.length();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = digits.charAt(i) - '0';
        }
        String[][] map = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o"}, {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};
        ArrayList<String> list = new ArrayList<String>();
        if (len == 0) {
            return list;
        }
        for (String ts:map[nums[0]-2]) {
            list.add(ts);
        }
        for (int e = 1; e < len; e++) {
            int index = nums[e];
            ArrayList<String> listtp = new ArrayList<String>();
            for (String s:list) {
                for (String ts:map[index-2]) {
                    listtp.add(s+ts);
                }
            }
            list = listtp;
        }
        HashSet<String> set = new HashSet<String>();
        for (String s:list) {
            set.add(s);
        }
        ArrayList<String> ans = new ArrayList<String>();
        for (String s:set) {
            ans.add(s);
        }
        return ans;
    }
    
}

