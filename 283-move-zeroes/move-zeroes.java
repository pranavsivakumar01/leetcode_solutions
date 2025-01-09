class Solution {
    public void moveZeroes(int[] nums) {

        int[] arr=new int[nums.length];
        int idx=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                arr[idx++]=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }
        
    }
}