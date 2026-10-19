class Solution
 {
    public List<Integer> targetIndices(int[] nums, int target) 
    {
        
        // int n= nums.length-1;
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();//to store the indices dynamically and matches the return type
        for(int i=0;i<=nums.length-1;i++)
        {
          if(nums[i]==target)
          {
            temp.add(i);// adding the required index in the list
          }
        }
        return temp ;
    }
}