class Solution {
    public int maximumCount(int[] nums) {
        int  negativecount=0;
        int positivecount=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<0)
            {
                negativecount++;
            }
            if(nums[i]>0)
            {
                positivecount++;
            }
        }
        int max=0;
        if(negativecount==positivecount)
        {
            return positivecount;
        }
        else if(negativecount>positivecount)
        {
            return negativecount;
        }
        else
        {
            return positivecount;
        }

    }
}