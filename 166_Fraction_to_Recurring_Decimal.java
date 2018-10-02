class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        int flag = 1;
        long numerator1;
        long denominator1;
        if ((numerator>0&&denominator<0)||(numerator<0&&denominator>0)) {
            flag = -1;
            numerator1 = numerator>0?numerator:(long)-1*numerator;
            denominator1 = denominator>0?denominator:(long)-1*denominator;
        } else if (numerator<0&&denominator<0) {
            numerator1 = (long)-1*numerator;
            denominator1 = (long)-1*denominator;
        } else {
            numerator1 = numerator;
            denominator1 = denominator;
        }
        long zhengshu = numerator1/denominator1;
        long yushu = numerator1 - (zhengshu*denominator1);
        if (yushu == 0) {
            String ans = zhengshu+"";
            if (flag == 1) {
                return ans;
            } else {
                return "-"+ans;
            }
        }
        HashMap<Long, Integer>map = new HashMap<Long, Integer>();
        long all = yushu;
        int index = 1;
        ArrayList<Long> list = new ArrayList<Long>();
        while (!map.containsKey(all)&&all!=0) {
            map.put(all, index);
            long temp = (all*10)/denominator1;
            list.add(temp);
            all = all*10 - temp*denominator1;
            index++;
        }
        String ans = "";
        if (all == 0) {
            ans = zhengshu+".";
            for (Long i:list) {
                ans = ans+i+"";
            }
        } else {
            int fromindex = map.get(all);
            ans = zhengshu+".";
            for (int i = 0; i < fromindex-1; i++) {
                ans = ans+list.get(i)+"";
            }
            ans = ans+"(";
            for (int i = fromindex-1; i < index-1; i++) {
                ans = ans+list.get(i)+"";
            }
            ans = ans+")";
        }
        if (flag == 1) {
            return ans;
        } else {
            return "-"+ans;
        }
    }
}
