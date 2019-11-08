class Solution {
    public String getHint(String secret, String guess) {
        int len1 = secret.length();
        int len2 = guess.length();
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (int i = 0; i < len1; i++) {
            char cr = secret.charAt(i);
            if (map1.containsKey(cr)) {
                map1.put(cr, map1.get(cr) + 1);
            } else {
                map1.put(cr, 1);
            }
        }
        for (int i = 0; i < len2; i++) {
            char cr = guess.charAt(i);
            if (map2.containsKey(cr)) {
                map2.put(cr, map2.get(cr) + 1);
            } else {
                map2.put(cr, 1);
            }
        }
        int a = 0;
        int flag = 0;
        while (flag<len1&&flag<len2) {
            if (secret.charAt(flag) == guess.charAt(flag)) {
                a++;
            }
            flag++;
        }
        int b = 0;
        for (char ii:map1.keySet()) {
            if (map2.containsKey(ii)) {
                b+=Math.min(map1.get(ii), map2.get(ii));
            }
        }
        b-=a;
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        return aa+"A"+bb+"B";
    }
}
