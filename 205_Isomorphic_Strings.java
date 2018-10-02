class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] arr1 = s.toCharArray();
        int len1 = arr1.length;
        char[] arr2 = t.toCharArray();
        int len2 = arr2.length;
        if (len1!=len2) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < len1; i++) {
            if (map.containsKey(arr1[i])) {
                if (map.get(arr1[i])!=arr2[i]) {
                return false;
                }
            } else {
                if(map.containsValue(arr2[i])){
                    return false;
                }
                map.put(arr1[i], arr2[i]);
            }
        }
        return true;
    }
}
