class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> freq= new HashMap<>();
        List<String> a= new  ArrayList<>();
         String combined = s1 + " " + s2;
         String[] words = combined.split(" ");
         for(String word: words)
         {
            freq.put(word,freq.getOrDefault(word,0)+1);
         }
         for(String res: freq.keySet()){
            if(freq.get(res)==1)
            {
                a.add(res);
            }
         }
         return a.toArray(new String[0]);
        
    }
}