class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max =Integer.MIN_VALUE;
        for (int i:nums) {
            if (!map.containsKey(i)) {
                int left = map.containsKey(i-1)?map.get(i-1):0;
                int right = map.containsKey(i+1)?map.get(i+1):0;
                if (max < (left+right+1)) {
                    max = left + right + 1;
                }
                map.put(i, left+right+1);
                map.put(i-left, left+right+1);
                map.put(i+right, left+right+1);
            }
        }
        return max;
    }
}
