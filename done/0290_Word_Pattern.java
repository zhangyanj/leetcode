class Solution {
    public boolean wordPattern(String pattern, String str) {
        char[] arr = pattern.toCharArray();
        int len = arr.length;
        String[] strarr=str.split(" "); 
        if (len == 1&&len==strarr.length) {
            return true;
        }
        if (len!=strarr.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<Character, String>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(arr[i])) {
                if (!map.get(arr[i]).equals(strarr[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(strarr[i])) {
                    return false;
                }
                map.put(arr[i], strarr[i]);
            }
        }
        return true;
    }
}
