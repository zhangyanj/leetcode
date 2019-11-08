class Solution {
    public String getPermutation(int n, int k) {
        int ctcount = 1;
        for (int i = 1; i <= n; i++) {
            ctcount*=i;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++) {
            list.add(i);
        }
        String s = "";
        int index = 1;
        for (int i = n; i > 1; i--) {
            index = (k-1)/(ctcount/i)+1;
            k = k - (ctcount/i)*(index-1);
            System.out.println(index);
            s+=list.get(index);
            list.remove(index);
            ctcount = ctcount/i;
        }
        s+=list.get(1);
        return s;
    }
}
