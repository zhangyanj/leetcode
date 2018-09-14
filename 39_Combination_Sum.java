class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> tempans = new ArrayList<Integer>();
        main(ans ,tempans, candidates, target, 0, 0);
        return ans;
    }
    
    public void main(List<List<Integer>> ans, List<Integer> tempans, int[] candidates, int target, int i, int nowsum){
        if (nowsum == target) {
            ans.add(new ArrayList<Integer>(tempans));
            return;
        }
        if (i == candidates.length) {
            return;
        }
        for (int j = 0; (j*candidates[i]+nowsum) <= target; j++) {
            for (int k = 0; k < j; k++) {
                tempans.add(candidates[i]);   
            }
            main(ans, tempans, candidates, target, i+1, j*candidates[i]+nowsum);
            for (int k = 0; k < j; k++) {
                tempans.remove(tempans.size()-1);
            }
        }
    }
}
