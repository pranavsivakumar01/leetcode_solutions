class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> a=new ArrayList<>();
        String prev="";
        String arr1[]= new String[words.length];
        for(int i=0; i<words.length; i++)
        {
            char res[]=words[i].toCharArray();
            Arrays.sort(res);
            arr1[i]=new String(res);
        }
       for(int i=0; i<words.length; i++)
       {
         if(!arr1[i].equals(prev))
         {
            a.add(words[i]);
            prev=arr1[i];
         }
       }
       return a;
    }
}