class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                if(nums[i]+nums[j]==target){
                    int res[]={i,j};
                    return res;
                }
            }
        }
        return null;
    }
}