class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> a= new HashMap<>();
        for(int num : nums)
        {
            a.put(num,a.getOrDefault(num,0)+1);
        }
        int maxFrequency = 0;
        int count=0;
        for (int freq : a.values()) {
            maxFrequency = Math.max(maxFrequency, freq);
        }
        for(int num: nums)
        {
            if(a.get(num)==maxFrequency)
            {
                count++;
            }
        }

        return count;
    }
}