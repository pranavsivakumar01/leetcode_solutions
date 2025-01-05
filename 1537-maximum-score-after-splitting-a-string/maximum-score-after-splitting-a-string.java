class Solution {
    public int maxScore(String s) {
        int n=s.length();        
        int maxScore=0;
        int cntZero=0;
        int cntOne=0;

        
        for(char ch:s.toCharArray()){
            if(ch=='1') cntOne++;
        }

        
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)=='1') cntOne--;
            else cntZero++;
            
            
            maxScore=Math.max(maxScore, cntZero+cntOne);
        }


        return maxScore;
    }
}