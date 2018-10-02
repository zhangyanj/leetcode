class Solution {
    ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        // HashSet<String> set = new HashSet<String>();
        ArrayList<String> templist = new ArrayList<String>();
        templist.add(beginWord);
        main(templist, wordList, beginWord, endWord);
        if (ans.size() == 0) {
            return 0;
        }
        int as = Integer.MAX_VALUE;
        for (ArrayList<String> tp:ans) {
            as=as<tp.size()?as:tp.size();
        }
        return as;
    }
    
    public void main(ArrayList<String> temp, List<String> wordList, String nowWord, String endWord) {
        if (isAmostSame(nowWord, endWord)) {
            temp.add(endWord);
            ans.add(new ArrayList<String>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        for (String s:wordList) {
            if (temp.contains(s)) {
                continue;
            }
            if (isAmostSame(nowWord, s)) {
                temp.add(s);
                main(temp, wordList, s, endWord);
                temp.remove(temp.size()-1);
            }
        }
        return;
    }
    
    public boolean isAmostSame(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) != two.charAt(i)) {
                count++; 
            }
            if (count > 1) return false;
        }
        return count==1;
    }
}
