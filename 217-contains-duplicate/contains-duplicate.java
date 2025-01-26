class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map <Integer,Integer> a= new HashMap<>();
        for(int num : nums)
        {
            a.put(num,a.getOrDefault(num,0)+1);
        }
        for(int num: nums)
        {
            if(a.get(num)>1)
            {
                return true;
            }
        }
        return false;
    }
}