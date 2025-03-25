class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
        {
            return intervals;
        }
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        List<int[]> result = new ArrayList<>();
        int[] newinterval= intervals[0];
        result.add(newinterval);
        for(int[] interva: intervals)
        {
            if(interva[0]<=newinterval[1])
            {
                newinterval[1]=Math.max(newinterval[1],interva[1]);
            }
            else
            {
                newinterval=interva;
                result.add(newinterval);
            }
        }
      return result.toArray(new int[result.size()][]);
    }
}