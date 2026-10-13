class Solution
{
    public int numberOfSteps(int num)
    {
        int count1=0;
        int count2 =0;
      while(num>0)
      {
        // int count1=0;
        // int count2 =0;
        if(num%2==0)
        {
            num=num/2;
            count1++;
        }
        else{
            num-=1;
            count2++;

        }
      } 
      return count1+count2; 
    }
}