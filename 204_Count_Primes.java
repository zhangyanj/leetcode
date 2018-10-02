class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n+1];
        int index = 2;
        int ct = 0;
        while (true) {
            if (index >= arr.length) {
                return ct;
            }
            while (index < arr.length&&arr[index]) {
                index++;
            }
            if (index >= arr.length-1) {
                return ct;
            }
            ct++;
            for (int i = 2; i * index <= n; i++) {
                arr[i*index] = true;
            }
            index++;
        }
    }
}
