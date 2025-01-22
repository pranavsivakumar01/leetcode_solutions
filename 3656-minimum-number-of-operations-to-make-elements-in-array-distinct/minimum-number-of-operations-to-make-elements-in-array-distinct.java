class Solution {
    public int minimumOperations(int[] nums) {
    HashSet <Integer> a = new HashSet<>();
    for(int num : nums)
    {
        a.add(num);
    }
    if(nums.length==a.size())
    {
        return 0;
    }
    int stin=0;
    int oper=0;
    while(stin<nums.length)
    {
        int removecount= Math.min(3,nums.length);
        stin += removecount;
        oper++;

    a.clear();
    for(int i=stin; i<nums.length; i++)
    {
        a.add(nums[i]);
    }
    if(a.size()==nums.length-stin)
    {
        break;
    }
    }
   return oper;
    }
}