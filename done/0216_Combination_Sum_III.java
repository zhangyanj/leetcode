class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> tempans = new ArrayList<Integer>();
        main(ans, tempans, 1, 0, n, k);
        return ans;
    }
    public void main(List<List<Integer>> ans, List<Integer> tempans, int nowindex, int nowsum, int target, int targetcount){
        if (tempans.size() == targetcount&&nowsum == target) {
            ans.add(new ArrayList<Integer>(tempans));
        }
        if (tempans.size() > targetcount) {
            return;
        }
        if (nowsum > target) {
            return;
        }
        for (int i = nowindex; i <= 9; i++) {
            tempans.add(i);
            main(ans, tempans, i+1, nowsum+i, target, targetcount);
            tempans.remove(tempans.size()-1);
        }
    }
}
