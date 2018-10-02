class Solution {
    public List<String> summaryRanges(int[] nums) {
        String temp = "";
        List<String> ans = new ArrayList<String>();
        int len = nums.length;
        int nowindex = 0;
        while (nowindex < len - 1) {
            temp = nums[nowindex]+"";
            while ((nowindex < len - 1)&&(nums[nowindex] + 1)==nums[nowindex+1]) nowindex++;
            if (Integer.valueOf(temp) == nums[nowindex]) {
                ans.add(temp);
            } else {
                temp = temp+"->"+nums[nowindex];  
                ans.add(temp);
            }
            nowindex++;
        }
        if (nowindex == len - 1) {
            ans.add(nums[len - 1] + "");
        }
        return ans;
    }
}
