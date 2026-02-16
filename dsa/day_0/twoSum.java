class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0;
        int b = 0;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j] == target && i!=j)
                {
                    a = i;
                    b = j;
                    flag = true;
                }    
            }
            if(flag) break;
        }
        return new int[]{a,b};
    }
}