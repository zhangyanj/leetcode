class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> tempans = new ArrayList<Integer>();
        main(ans, tempans, 0, nums);
        return ans;
    }
    
    public void main(List<List<Integer>> ans, List<Integer> tempans, int nowindex, int[] nums){
        if (nowindex >= nums.length) {
            ans.add(new ArrayList<Integer>(tempans));
            return;
        }
        main(ans, tempans, nowindex + 1, nums);
        tempans.add(nums[nowindex]);
        main(ans, tempans, nowindex + 1, nums);
        tempans.remove(tempans.size() - 1);   
    }
}
