class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> tempans = new ArrayList<Integer>();
        Set<List<Integer>> ans = new HashSet<List<Integer>>();
        int len = nums.length;
        main(ans, tempans, nums, 0);
        List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
        for (List<Integer> i:ans) {
            ans1.add(i);
        }
        return ans1;
    }
    public void main (Set<List<Integer>> ans, List<Integer> tempans, int[] nums, int nowindex) {
        if (nowindex == nums.length) {
            ans.add(new ArrayList<Integer>(tempans));
            return;
        }
        main(ans, tempans, nums, nowindex+1);
        tempans.add(nums[nowindex]);
        main(ans, tempans, nums, nowindex+1);
        tempans.remove(tempans.size() - 1);
    }
}
