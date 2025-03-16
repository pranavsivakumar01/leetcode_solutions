class Solution {
    public long repairCars(int[] ranks, int cars) {
        long min=1;
        long max=(long)ranks[0]*cars*cars;
        while(min<max)
        {
            long mid=(min+max)/2;
            long carsum=0;
            for(int rank :ranks)
            {
                carsum+=(long)Math.sqrt(mid/rank);
            }
            if(carsum>=cars)
            {
                max=mid;
            }
            else 
            {
                min=mid+1;
            }
        }
        return min;
    }
}