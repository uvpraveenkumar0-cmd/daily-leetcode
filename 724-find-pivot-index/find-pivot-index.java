class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int pref_sum =0;

      int  n= nums.length;

        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        for(int j=0;j<n;j++)
        {
            sum-=nums[j];
            if(pref_sum==sum)
            {
                return j;
            }
            pref_sum+=nums[j];
        }
        return -1;
    }
}