class Solution {
    public List<List<Integer>> fourSum(int[] numbers, int target) {
                List<List<Integer>> ans=new ArrayList<List<Integer>>();
                int len = numbers.length;
        if (len == 0) {
            return ans;
        }
        Arrays.sort(numbers);
        int minmin = numbers[0];
        int maxmax = numbers[len - 1];
        for(int j = 0;j < len-3;j++){
            for(int i = j+1; i < len-2;i++){
                int first=i+1;
                int last=len-1;
                while(first<last){
                    int temp=numbers[j]+numbers[i]+numbers[first]+numbers[last];
                    if(temp>target){
                        last--;
                    }else if(temp<target){
                        first++;
                    }else if(temp == target&&first<last) {
                        List<Integer> tempans=new ArrayList<Integer>();
                        tempans.add(numbers[j]);
                        tempans.add(numbers[i]);
                        tempans.add(numbers[first]);
                        tempans.add(numbers[last]);
                        if(!ans.contains(tempans)){
                            ans.add(tempans); 
                        }
                        first++;
                    }
                }
            }
        }
        return ans;
    }
}

