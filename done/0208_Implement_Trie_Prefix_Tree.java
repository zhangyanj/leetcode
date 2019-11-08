class TrieNode {
    boolean islevel = false;
    HashMap<Character, TrieNode> mapp;
    public TrieNode() {
        
    }
}
class Trie {
    /** Initialize your data structure here. */
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode roottp = root;
        for (char c:word.toCharArray()) {
            if (roottp.mapp.containsKey(c)) {
                roottp = roottp.mapp.get(c);
            } else {
                TrieNode newRoot = new TrieNode();
                roottp.mapp.put(c, newRoot);
                roottp = newRoot;
            }
        }
        roottp.islevel = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode roottp = root;
        for (char c:word.toCharArray()) {
            if (roottp.mapp.containsKey(c)) {
                roottp = roottp.mapp.get(c);
            } else {
                return false;
            }
        }
        return roottp.islevel;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode roottp = root;
        for (char c:prefix.toCharArray()) {
            if (roottp.mapp.containsKey(c)) {
                roottp = roottp.mapp.get(c);
            } else {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
