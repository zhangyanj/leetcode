class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> tempans1 = new ArrayList<Integer>();
        if (numRows == 0) {
            return ans;
        }
        tempans1.add(1);
        ans.add(tempans1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> tempans = new ArrayList<Integer>();
            tempans.add(1);
            List<Integer> tp = ans.get(ans.size() - 1);
            for (int j = 1; j < i; j++) {
                tempans.add((tp.get(j) + tp.get(j - 1)));
            }
            tempans.add(1);
            ans.add(new ArrayList<Integer>(tempans));
        }
        return ans;
    }
}
