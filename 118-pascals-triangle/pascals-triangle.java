class Solution {
    
     public int ncr(int n, int r)
        {
            if(n==0 ||r==0)
            {
                return 1;
            }
            int res=1;
            for(int i=0; i<r; i++)
            {
               res*=(n-i);
               res/=i+1;
            }
            return res;
        }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a= new ArrayList <List<Integer>>();
        for(int i=0; i<numRows; i++)
        {
            List <Integer> m= new ArrayList<>();
            for(int j=0; j<=i; j++)
            {
                m.add(ncr(i,j));
            }
            a.add(m);
        }
        
        return a;
    }
}