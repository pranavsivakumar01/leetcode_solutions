class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(int i=0; i<s.length(); i++)
        {
            int a=(s.charAt(i)-'a')+1;
            while(a!=0)
            {
                int b=a%10;
                a=a/10;
                sum+=b;
               
            }
        }
        while(k>1)
        {
            int temp=0;
            while(sum!=0)
            {
                int n1=sum%10;
                sum=sum/10;
                temp+=n1;
            }
            sum=temp;
            k--;
        }
        return sum;
        

    }
}