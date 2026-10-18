class Solution {
    public int addDigits(int num) {
        int sum=0;
        if (num<=9)
        {
            return num;
        }
    //    int n=num.length;
        while(num>0)
        {
            int digit = num%10;
            sum+=digit;
            num/=10;
        }
        
        return addDigits(sum);
    }
}