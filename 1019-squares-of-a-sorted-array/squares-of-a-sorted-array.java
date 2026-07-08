class Solution {
    public int[] sortedSquares(int[] nums)
    {
        int temp[]=new int[nums.length];
        int k=0;
        int temp2;
        for(int i=0;i<nums.length;i++)
        {
            temp[k]=nums[i]*nums[i];
            k++;
        }   
      /* for(int j=0;j<temp.length-1;j++)
        {
            if (temp[j]>temp[j+1])
            {
                temp2=temp[j];
                temp[j]=temp[j+1];
                temp[j+1]=temp2;
            }
        } */
        Arrays.sort(temp); 
        return temp;   
    }
}
