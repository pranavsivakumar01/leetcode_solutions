import java.util.HashMap;
import java.util.Map;

class Solution {
    public String kthDistinct(String[] arr, int k) {
    Map<String,Integer> map= new HashMap<>();
    List<String> res= new ArrayList<>();
    for(String s: arr)
    {
        map.put(s,map.getOrDefault(s,0)+1);
    }
    int count=0;
    for(String s: arr)
    {
        if(map.get(s)==1)
        {
            
      
        res.add(s);
        }

      
    }
    if(k<=res.size())
    {
        return res.get(k-1);
    }
    return "";

     
    }
}
