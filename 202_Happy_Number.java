class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while (!set.contains(n)&&n!=1) {
            set.add(n);
            System.out.println(n);
            int tempn = 0;
            while (n!=0) {
                tempn+=(n%10)*(n%10);
                n/=10;
            }
            System.out.println(tempn);
            System.out.println("************");
            n = tempn;
        }
        if (n==1) {
            return true;
        }
        return false;
    }
}
