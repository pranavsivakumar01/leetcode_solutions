class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> a1 = new ArrayList<>();
        Map<Integer,Integer> a= new HashMap<>();
        for(int num : nums)
        {
            a.put(num,a.getOrDefault(num,0)+1);
        }
        for(int num: nums)
        {
            if(a.get(num)>n/3 && !a1.contains(num))
            {
                a1.add(num);
            }
        }
        return a1;
    }
}