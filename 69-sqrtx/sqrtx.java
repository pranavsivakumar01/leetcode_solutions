class Solution {
    public int mySqrt(int x) {
       if(x==0)
       {
        return x;
       }
       int result=0;
       int left=1;
       int rigth=x;
       while(left<=rigth)
       {
        int mid= (left+rigth)/2;
        if(mid<=x/mid)
        {
            result=mid;
            left=mid+1;
        }
        else
        {
            rigth=mid-1;
        }
       }
       return result;
    }
}
