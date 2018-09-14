class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<HashMap<Character, Integer>, ArrayList<String>>();
        ArrayList<List<String>> ans = new ArrayList<List<String>>();
        if (strs.length == 0) {
            return ans;
        }
        for (String s:strs) {
            HashMap<Character, Integer> maptemp  = main(s);
            if (map.containsKey(maptemp)) {
                map.get(maptemp).add(s);
            } else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(s);
                map.put(maptemp, list);
            }
        }
        for (List<String> t:map.values()) {
            ans.add(t);
        }
        return ans;
    }
    public HashMap<Character, Integer> main(String s) {
        HashMap<Character, Integer> map= new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);               
            }
        }
        return map;
    }
}
