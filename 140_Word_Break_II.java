class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        if (!flit(s, wordDict)) {
            List<String> templist = new ArrayList<String>();
            return templist;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (String i:wordDict) {
            set.add(i.length());
        }
        int len = s.length();
        Map<Integer, Set<String>> map = new HashMap<Integer, Set<String>>();
        for (int i = 0; i < len; i++) {
            for (int j:set) {
                if (i+j>len) {
                    continue;
                }
                if (i == 0) {
                    if (wordDict.contains(s.substring(i, i+j))) {
                        if (map.containsKey(i+j-1)) {
                            map.get(i+j-1).add(s.substring(i, i+j));   
                        } else {
                            Set<String> templist = new HashSet<String>();
                            templist.add(s.substring(i, i+j));
                            map.put(i+j-1, templist);
                        }
                    }
                } else {
                    if (wordDict.contains(s.substring(i, i+j))&&map.containsKey(i-1)) {
                        if (map.containsKey(i+j-1)) {
                            for (String st:map.get(i-1)) {
                                map.get(i+j-1).add(st+" "+s.substring(i, i+j));
                            }
                        } else {
                            Set<String> templist = new HashSet<String>();
                            for (String st:map.get(i-1)) {
                                templist.add(st+" "+s.substring(i, i+j));
                            }
                            map.put(i+j-1, templist);
                        }
                    }
                }
            }
        }
        List<String> templist = new ArrayList<String>();
        if (!map.containsKey(len-1)) {
            return templist;
        }
        for (String i:map.get(len-1)) {
            templist.add(i);
        }
        return templist;
    }
    
    public boolean flit(String s, List<String> wordDict){
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();
        for (String i:wordDict) {
            for (int j = 0; j < i.length(); j++) {
                set1.add(i.charAt(j));   
            }
        }
        for (int j = 0; j < s.length(); j++) {
            set2.add(s.charAt(j));   
        }
        for (Character i:set2) {
            if (!set1.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
