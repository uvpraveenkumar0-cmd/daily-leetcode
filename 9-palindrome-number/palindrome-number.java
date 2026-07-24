class Solution
{
    public boolean isPalindrome(int x) 
    {
        long reve=0;
        int originalnum = x;
        while(x>0)
        {
           long digit = x%10;
            reve  = reve*10+digit;
           x=x/10; 
        }
        if(reve==originalnum)
        {
            return true;
        }
        return false;
    }
}