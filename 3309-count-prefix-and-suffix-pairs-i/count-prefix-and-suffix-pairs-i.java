class Solution {
    int count=0;
    public int countPrefixSuffixPairs(String[] words) {
       for(int i=0; i<words.length; i++)
        {
            for(int j=i+1; j<words.length; j++)
            {
                boolean res= isPrefixAndSuffix(words[i],words[j]);
               if(res)
               {
                count++;
               }
            }
        }
        return count;
    }
    
    public boolean isPrefixAndSuffix(String str1,String str2)
    {
        boolean ispre=str2.startsWith(str1);
        boolean issuf=str2.endsWith(str1);
        if(ispre && issuf )
        {
            return true;
        }
        return false;
    }
}