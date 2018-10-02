class TrieNode {
    char val;
    boolean islevel = false;
    HashMap<Character, TrieNode> map = new HashMap<Character, TrieNode>();
    public TrieNode(char c) {
        val = c;
    }
}
class WordDictionary {
    TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode(' ');
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode roottp = root;
        for (char c:word.toCharArray()) {
            if (roottp.map.containsKey(c)) {
                roottp = roottp.map.get(c);
            } else {
                TrieNode newnode = new TrieNode(c);
                roottp.map.put(c, newnode);
                roottp = newnode;
            }
        }
        roottp.islevel = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        TrieNode roottp = root;
        return mainSearch(word, 0, roottp);
    }
    
    public boolean mainSearch(String word, int index, TrieNode nd) {
//         if (index>word.length()-1) {
//             return true;
//         }
//         if (nd.map.containsKey(word.charAt(index))) {
            
//         }
        if (index==word.length()-1) {
            if (nd.map.containsKey(word.charAt(index))) {
                return nd.map.get(word.charAt(index)).islevel;
            } else {
                if (word.charAt(index) == '.') {
                    boolean tpans = false;
                    for (char c:nd.map.keySet()) {
                        tpans = tpans||nd.map.get(c).islevel;
                    }
                    return tpans;
                } else {
                    return false;
                }
            }
        }
        
        if (word.charAt(index) == '.') {
            boolean tpans = false;
            for (char c:nd.map.keySet()) {
                tpans = tpans||mainSearch(word, index+1, nd.map.get(c));
            }
            return tpans;
        }
        if (nd.map.containsKey(word.charAt(index))) {
            return mainSearch(word, index+1, nd.map.get(word.charAt(index)));   
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
