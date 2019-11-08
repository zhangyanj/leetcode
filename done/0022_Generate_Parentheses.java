class Solution {
    List<String> ans = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return ans;
        }
        int[] ct = {n, n};
        String temp = "";
        main(temp, ct, 0);
        return ans;
    }
    public void main(String temp, int[] count, int validcount) {
        if (count[0] == 0&&count[1] == 0) {
            ans.add(temp);
            return;
        }
        if (count[0] > 0) {
            count[0]--;
            main(temp+"(", count, validcount+1);
            count[0]++;
        }
        if (count[1] > 0&&validcount>0) {
            count[1]--;
            main(temp+")", count, validcount-1);
            count[1]++;
        }
    }
}
