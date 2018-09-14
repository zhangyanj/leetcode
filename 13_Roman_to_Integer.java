class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] arr = s.toCharArray();
        int len = arr.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            if (i==0||map.get(arr[i]) <= map.get(arr[i-1])) {
                ans+=map.get(arr[i]);
            } else {
                ans+=map.get(arr[i]) - 2*map.get(arr[i-1]);
            }
        }
        return ans;
    }
}
