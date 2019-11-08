class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        if (rowIndex == 0) {
            return pre;
        }
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> now = new ArrayList<Integer>();
            now.add(1);
            for (int j = 1; j < i; j++) {
                now.add(pre.get(j) + pre.get(j - 1));
            }
            now.add(1);
            pre = new ArrayList<Integer>(now);
        }
        return pre;   
    }
}