class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int freq[] = new int [nums.length];
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int indx=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            freq[indx++]=entry.getValue();
        }
        Arrays.sort(freq);
        List<Integer> lis= new ArrayList<>();
        int i=freq.length-1;
        while(k>0)
        {
            lis.add(freq[i]);
            k--;
            i--;
        }
        int res[]= new int[lis.size()];
        int idx2=0;
       for(Map.Entry<Integer,Integer> entry : map.entrySet())
       {
        if(lis.contains(entry.getValue()))
        {
            res[idx2++]=entry.getKey();
        }
       }

        return res;
    }
}