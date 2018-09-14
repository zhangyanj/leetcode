class Solution {
    int len = 0;
    ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
    public List<String> restoreIpAddresses(String s) {
        len = s.length();
        ArrayList<String> tp = new ArrayList<String>();
        main(tp, s, 0);
        ArrayList<String> fina = new ArrayList<String>();
        for (ArrayList<String> i:ans) {
            String q = "";
            for (int h = 0; h < i.size()-1; h++) {
                q=q+i.get(h)+".";
            }
            q=q+i.get(i.size()-1);
            fina.add(q);
        }
        return fina;
    }
    public void main(ArrayList<String> tp, String s, int from) {
        if (tp.size() == 4&&from == len) {
            ans.add(new ArrayList<String>(tp));
            return;
        }
        if (from>=len||tp.size() >= 4) {
            return;
        }
        for (int i = 1; i <= 3; i++) {
            String temp = "";
            for (int j = from; j < from+i&&j<len; j++) temp = temp+s.charAt(j);
            if (Integer.valueOf(temp) > 255) {
                continue;
            }
            if (temp.charAt(0) == '0'&&temp.length()>1) {
                continue;
            }
            tp.add(temp);
            main(tp, s, from+i);
            tp.remove(tp.size() - 1);
        }
    }
}
