class Solution {
    public List<List<Integer>> threeSum(int[] numbers) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
                int len = numbers.length;
        if (len == 0) {
            return ans;
        }
        Arrays.sort(numbers);
        int minmin = numbers[0];
        int maxmax = numbers[len - 1];
        for(int i=0;i<len-2;i++){
            if (numbers[i] > (minmin*-2)||numbers[i] < (maxmax*-2)) {
                continue;
            }
            int first=i+1;
            int last=len-1;
            while(first<last){
                int temp=numbers[i]+numbers[first]+numbers[last];
                if(temp>0){
                    last--;
                }else if(temp<0){
                    first++;
                }else if(temp == 0&&first<last) {
                    List<Integer> tempans=new ArrayList<Integer>();
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
        return ans;
    }
}
//这个有些问题， 有两个case超时
