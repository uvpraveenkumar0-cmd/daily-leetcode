class Solution {
    public int largestAltitude(int[] gain) 
    {
      int  MaxAlt=0;
        int CurrAlt=0;
        for(int gains: gain)
        {
            CurrAlt+=gains;
            MaxAlt=Math.max(MaxAlt,CurrAlt);
        }
        return MaxAlt;
        
    }
}