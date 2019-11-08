class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> ans = new HashSet<List<Integer>>();
        List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
        List<Integer> tempans = new ArrayList<Integer>();
        main(ans, tempans, 0, 0, candidates, target);
        for (List<Integer> ww:ans) {
            ans1.add(ww);
        }
        return ans1;
    }
    
    public void main(Set<List<Integer>> ans ,List<Integer> tempans, int nowsum, int nowindex, int[] candidates, int target){
        if (nowsum > target) {
            return;
        }
        if (nowsum == target) {
            ans.add(new ArrayList<Integer>(tempans));
            return;
        }
        if (nowindex >= candidates.length) {
            return;
        }
        main(ans, tempans, nowsum, nowindex+1, candidates, target);
        tempans.add(candidates[nowindex]);
        main(ans, tempans, nowsum+candidates[nowindex], nowindex+1, candidates, target);
        tempans.remove(tempans.size()-1);
    }
}
