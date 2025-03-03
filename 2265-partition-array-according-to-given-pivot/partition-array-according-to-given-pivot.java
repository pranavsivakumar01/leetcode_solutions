class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      List<Integer> list1= new ArrayList<Integer>();
        List<Integer> list2= new ArrayList<Integer>();
         List<Integer> list3= new ArrayList<Integer>();
         List<Integer> list4= new ArrayList<Integer>();
        for(int n:nums)
        {
            if(n<pivot)
            {
                list1.add(n);
            }
            else if(n>pivot)
        {
            list2.add(n);
        }
            else
            {
                list3.add(n);
            }
        }
        list4.addAll(list1);
        list4.addAll(list3);
        list4.addAll(list2);
        System.out.print(list4);
         int[] res = list4.stream().mapToInt(i -> i).toArray();
        return res;
        // System.out.print(list3);
        // System.out.print(list2);
       
    }
}