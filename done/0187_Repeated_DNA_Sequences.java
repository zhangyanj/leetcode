class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map  = new HashMap<String, Integer>();
        for (int i = 0; i < s.length() - 9; i++) {
            String temp = s.substring(i, i+10);
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp)+1);
            } else {
                map.put(temp, 1);
            }
        }
        ArrayList<String> ans = new ArrayList<String>();
        for (String ss:map.keySet()) {
            if (map.get(ss) > 1) {
                ans.add(ss);
            }
        }
        return ans;
    }
}
