class Solution {
    public int threeSumClosest(int[] numbers, int target) {
        // List<List<Integer>> ans=new ArrayList<List<Integer>>();
        int ans = 1000000;
        int len = numbers.length;
        if (len == 0) {
            return ans;
        }
        Arrays.sort(numbers);
        for(int i=0;i<len-2;i++){
            int first=i+1;
            int last=len-1;
            while(first<last){
                int temp=numbers[i]+numbers[first]+numbers[last];
                if(temp > target){
                    if (Math.abs(temp-target) < Math.abs(ans-target)) {
                        ans = temp;
                    }
                    last--;
                }else if(temp < target){
                    if (Math.abs(temp-target) < Math.abs(ans-target)) {
                        ans = temp;
                    }
                    first++;
                }else if(temp == target&&first < last) {
                    return temp;
                }
            }
        }
        return ans;
    }
}
