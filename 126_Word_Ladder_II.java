class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> ans = new ArrayList<List<String>>();
        List<List<String>> ans1 = new ArrayList<List<String>>();
        List<String> tempans = new ArrayList<String>();
        tempans.add(beginWord);
        if (beginWord == endWord) {
            ans1.add(tempans);
            return ans1;
        }
        
        main(ans, tempans, 0, beginWord, endWord, wordList);
        int min = Integer.MAX_VALUE;
        for (List<String> i:ans) {
            if (i.size() < min) {
                min = i.size();
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i).size() == min) {
                ans1.add(ans.get(i));
            }
        }
        return ans1;
    }
    
    public void main(List<List<String>> ans, List<String> tempans, int hascount, String beginWord, String endWord, List<String> wordList){
        if (beginWord.equals(endWord)) {
            ans.add(new ArrayList<String>(tempans));
            return;
        }
        if (hascount >= wordList.size() - 1) {
            return;
        }
        for (int i = 0; i < wordList.size(); i++) {
            if (iswell(beginWord, wordList.get(i))) {
                String tp = wordList.get(i);
                wordList.set(i, "#");
                tempans.add(tp);
                main(ans, tempans, hascount + 1, tp, endWord, wordList);
                tempans.remove(tempans.size() - 1);
                wordList.set(i, tp);
            }
        }
    }
    public boolean iswell(String beginWord, String endWord){
        if (beginWord.length() != endWord.length()) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < beginWord.length(); i++) {
            if (beginWord.charAt(i) != endWord.charAt(i)) {
                count++;
                if (count >= 2) {
                    return false;
                }
            }
        }
        return true;   
    }
}
