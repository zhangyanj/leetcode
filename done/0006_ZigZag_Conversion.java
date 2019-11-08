class Solution {
    public String convert(String s, int numRows) {
        List<List<Character>> list = new ArrayList<List<Character>>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<Character>());
        }
        if (numRows == 1) {
            return s;
        }
        int len = s.length();
        if (len == 0) {
            return "";
        }
        char[] arr = s.toCharArray();
        int towards = -1;
        int index = 0;
        for (int i = 0; i < len ; i++) {
            list.get(index).add(arr[i]);
            if (towards == -1) {
                index++;
                if (index == numRows-1) {
                    towards = 1;
                }
            } else {
                index--;
                if (index == 0) {
                    towards = -1;
                }
            }
        }
        String ans = "";
        for (List<Character> tp:list) {
            for (Character i:tp) {
                ans=(ans+i+"");
            }
        }
        return ans;
    }
}
