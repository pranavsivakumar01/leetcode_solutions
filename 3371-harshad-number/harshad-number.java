class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int orginal=x;
        while(x>0)
        {
            int r=x%10;
            sum=sum+r;
            x=x/10;
        }
        if(orginal%sum==0)
        {
            return sum;
        }
        return -1;
    }
}