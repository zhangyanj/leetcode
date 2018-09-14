class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int ttlen = words.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (words.length == 0) {
            return list;
        }
        int len = words[0].length();
        for (String ss:words) {
            if (ss.length()!=len) {
                return list;
            }
        }
        int from = 0;
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        for (String ss:words) {
            if (map1.containsKey(ss)) {
                map1.put(ss, map1.get(ss)+1);
            } else {
                map1.put(ss, 1);
            }
        }
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        while (from+ttlen*len<=s.length()) {
            int tempfrom = from;
            int temptt = 0;
            while (temptt < ttlen) {
                String tempstr = s.substring(tempfrom, tempfrom+len);
                if (!map1.containsKey(tempstr)) {
                    break;
                }
                if (map2.containsKey(tempstr)&&map1.get(tempstr) <= map2.get(tempstr)) {
                    break;
                }
                
                if (map2.containsKey(tempstr)) {
                    map2.put(tempstr, map2.get(tempstr)+1);
                } else {
                    map2.put(tempstr, 1);
                }
                temptt++;
                tempfrom+=len;
            }
            if (temptt == ttlen) {
                list.add(from);
            }
            map2 = new HashMap<String, Integer>();
            from++;
        }
        return list;
    }
}
