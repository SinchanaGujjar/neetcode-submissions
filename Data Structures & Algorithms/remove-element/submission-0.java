class Solution {
    public int removeElement(int[] nums, int val) {
        int read=0;
        int write=0;
        for(read=0;read<nums.length;read++)
        {
            if(nums[read]!=val)
            {
                nums[write]=nums[read];
                write++;
            }
        }
        int k=write;
        // for(;write<nums.length;write++){
        //     nums[write]=0;
        // }
        return k;
    }
}
