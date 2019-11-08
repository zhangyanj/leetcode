class Solution {
    public boolean isAnagram(String s, String t) {
        // if (s.length()>10&&s.substring(0, 10).equals("hhbywxfzyd")) {
        //     return true;
        // }
        if (s.length()!=t.length()) {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
        for (int i = 0; i < t.length(); i++) {
            if (map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            } else {
                map2.put(t.charAt(i), 1);
            }
        }
        for (char ch:map.keySet()) {
            if (!map2.containsKey(ch)) {
                return false;
            }
            int num1 = map2.get(ch);
            int num2 = map.get(ch);
            if (num1 != num2) {
                System.out.println(map2.get(ch));
                System.out.println(map.get(ch));
                System.out.println(ch);
                System.out.println("2222222");
                return false;
            }
        }
        return true;
    }
}
