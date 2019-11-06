//给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
//
//返回 s 所有可能的分割方案。
//
//示例:
//
//输入: "aab"
//输出:
//[
//  ["aa","b"],
//  ["a","a","b"]
//]


//解题思路 1 回溯，就是如下解法
//思路2 和这个很相像，要用到搜索（dfs是必须的），但是判断一个字符串是不是回文串的操作是可以优化的，可以先把 i到j的子串是不是
//回文串求出来， 这种求dp[i][j]是不是回文串的方法自然而然想到了dp



class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<String> temp = new ArrayList<String>();
        dfs(temp, s);
        return res;
    }
    
    public void dfs(List<String> temp, String s) {
        if (s == null || s.length() == 0) {
            res.add(new ArrayList<String>(temp));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (isWell(s.substring(0, i))) {
                temp.add(s.substring(0, i));
                dfs(temp, s.substring(i, s.length()));
                temp.remove(temp.size() - 1);
            }
        }
    }
    
    public boolean isWell(String sb) {
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}