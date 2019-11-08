class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int len = nums.length;
        if (len == 0) {
            return ans;
        }
        if (len == 1) {
            ans.add(nums[0]);
            return ans;
        }
        if (len == 2) {
            ans.add(nums[0]);
            if (nums[0] != nums[1]) {
                ans.add(nums[1]);   
            }
            return ans;
        }
        int flag = 0;
        int flagnum = nums[0];
        int flag1 = 0;
        int flagnum1 = nums[1];
        for (int i = 0; i < len; i++) {
            if (nums[i] == flagnum) {
                flag++;
            } else if (nums[i] == flagnum1) {
                flag1++;
            } else if (flag == 0) {
                flag++;
                flagnum = nums[i];
            } else if (flag1 == 0) {
                flag1++;
                flagnum1 = nums[i];
            } else {
                flag--;
                flag1--;
            } 
        }
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == flagnum) {
                count++;
            }
            if (nums[i] == flagnum1) {
                count1++;
            }
        }
        if (count > len/3) {
            ans.add(flagnum);
        }
        if (count1 > len/3&&flagnum1 != flagnum) {
            ans.add(flagnum1);
        }
        return ans;
    }
}
