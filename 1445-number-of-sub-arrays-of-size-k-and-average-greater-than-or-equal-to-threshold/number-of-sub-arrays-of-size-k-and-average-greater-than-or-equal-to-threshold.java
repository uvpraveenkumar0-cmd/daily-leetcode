class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int windowSum=0;
        for(int i=0;i<=k-1;i++)
        {
            windowSum+=arr[i];

        }
        int max =   windowSum;
        if(max>=threshold*k)
        {
            count+=1;
        }
        for(int temp=k;temp<arr.length;temp++)
        {
              windowSum+=arr[temp];
                windowSum-=arr[temp-k];
                int avg=  windowSum/k;
                if(avg>=threshold)
                {
                    count+=1;
                }
        }
        return count;
    }
}