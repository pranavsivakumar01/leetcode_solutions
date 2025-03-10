class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long count = 0; 
        int length = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                length++; 
            } else {
                length = 0; 
            }
            count += length; 
        }
        return count + nums.length; 
    }
}
