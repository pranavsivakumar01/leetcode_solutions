class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        List <Integer>a = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>=k)
            {
                a.add(nums[i]);
            }
        }
        for(int n: a)
        {
            count++;
        }
        int res= Math.abs(count-nums.length);
        return res;       

    }
}