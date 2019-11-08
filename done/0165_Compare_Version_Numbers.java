class Solution {
    public int compareVersion(String version1, String version2) {
        String s1 = "";
        String s2 = "";
        ArrayList<String> str1 = new ArrayList<String>();
        ArrayList<String> str2 = new ArrayList<String>();
        for (int i = 0; i < version1.length(); i++) {
            String tp = "";
            while (i < version1.length()&&version1.charAt(i) != '.') tp = tp + version1.charAt(i++);
            int j = 0;
            while (j < tp.length()&&tp.charAt(j) == '0') j++;
            String tpp = "";
            for (int k = j; k < tp.length(); k++)  tpp = tpp + tp.charAt(k);
            System.out.println(tpp);
            if (!tpp.equals("")) {
                str1.add(tpp);                
            } else {
                str1.add("0");                              
            }
        }
        
        for (int i = 0; i < version2.length(); i++) {
            String tp = "";
            while (i < version2.length()&&version2.charAt(i) != '.') tp = tp + version2.charAt(i++);
            int j = 0;
            while (j < tp.length()&&tp.charAt(j) == '0') j++;
            String tpp = "";
            for (int k = j; k < tp.length(); k++)  tpp = tpp + tp.charAt(k);
            System.out.println(tpp);
            if (!tpp.equals("")) {
                str2.add(tpp);
            } else {
                str2.add("0");                
            }
        }
        
        // if (s1.length() > s2.length()) {
        //     return 1;
        // } else if (s1.length() < s2.length()) {
        //     return -1;
        // }
        // for (int i = 0; i < maxlen - s1.length(); i++) {
        //     s1 = s1 + '0';   
        // }
        // for (int i = 0; i < maxlen - s2.length(); i++) {
        //     s2 = s2 + '0';
        // }
        System.out.println("*************");
        for (int i = 0; i < str2.size()&&i < str1.size(); i++) {
            System.out.println(str1.get(i));
            System.out.println(str2.get(i));
            System.out.println("*************");
            if (Integer.valueOf(str1.get(i)) > Integer.valueOf(str2.get(i))) {
                return 1;
            } else if (Integer.valueOf(str1.get(i)) < Integer.valueOf(str2.get(i))) {
                return -1;
            }
        }
        if (str1.size() > str2.size()) {
            for (int j = str2.size(); j < str1.size(); j++) {
                if (Integer.valueOf(str1.get(j)) != 0) {
                    return 1;       
                }
            }
            return 0;
        } else if (str1.size() < str2.size()) {
            for (int j = str1.size(); j < str2.size(); j++) {
                if (Integer.valueOf(str2.get(j)) != 0) {
                    return -1;       
                }
            }
            return 0;
        } else {
            return 0;   
        }
        // if (Integer.valueOf(s1) > Integer.valueOf(s2)) {
        //     return 1;
        // } else if (Integer.valueOf(s1) < Integer.valueOf(s2)) {
        //     return -1;
        // } else {
        //     return 0;
        // }
    }
}
