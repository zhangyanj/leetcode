class Solution {
    public String countAndSay(int n) {
        String pre = "1";
        int count = 0;
        int num = 1;
        for (int i = 2; i <= n ;i++) {
            char prenum = pre.charAt(0);
            int counttemp = 1;
            String temppre = "";
            for (int j = 1; j < pre.length(); j++){
                if (pre.charAt(j) != pre.charAt(j-1)) {
                    temppre=(temppre+counttemp+prenum);
                    counttemp = 1;
                    prenum = pre.charAt(j);
                } else {
                    counttemp++;
                }
            }
            temppre=(temppre+counttemp+prenum);
            pre = temppre;
        }
        return pre;
    }
}
