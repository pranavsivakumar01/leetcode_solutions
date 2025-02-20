class Solution {
    public int search(int[] nums, int target) {
        // Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            
            else if(nums[left]<=nums[mid])
            {
                if(target<=nums[mid]&&target>=nums[left])
                {
                    right=mid-1;
                }
                else
                {
                    left=left+1;
                }
            }
            else
            {
                if(target>nums[mid]&&target<=nums[right])
                {
                    left=left+1;
                }
                else
                {
                    right=right-1;
                }
            }
        }
        return -1;
    }
}
