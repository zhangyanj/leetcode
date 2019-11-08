class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    // HashSet<Integer> set = new HashSet<Integer>();
    List<Integer> set = new ArrayList<Integer>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<Integer>();
        main(temp, nums);
        return ans;
    }
    public void main(List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            if (ans.contains(temp)) {
                return;
            } else {
                ans.add(new ArrayList<Integer>(temp));
                return;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(i)) {
                continue;
            }
            set.add(i);
            temp.add(nums[i]);
            main(temp, nums);
            temp.remove(temp.size() - 1);
            set.remove(set.size() - 1);
        }
    }
}