class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> dp = new ArrayList<List<Integer>>();
        int len = triangle.size();
        if (len == 0) {
            return 0;
        }
        int len1 = triangle.get(0).size();
        if (len1 == 0) {
            return 0;
        }
        List<Integer> dptemp1 = new ArrayList<Integer>();
        dptemp1.add(triangle.get(0).get(0));
        dp.add(dptemp1);
        for (int i = 1; i < len; i++) {
            List<Integer> dptemp = new ArrayList<Integer>();
            List<Integer> tt = dp.get(dp.size() - 1);
            dptemp.add(tt.get(0) + triangle.get(i).get(0));
            int j = 1;
            for (; j < i; j++) {
                dptemp.add(Math.min(tt.get(j), tt.get(j - 1)) + triangle.get(i).get(j));
            }
            dptemp.add(tt.get(tt.size() - 1) + triangle.get(i).get(j));
            dp.add(dptemp);
        }
        List<Integer> ans = dp.get(dp.size() - 1);
        int min = Integer.MAX_VALUE;
        for (int i:ans) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
