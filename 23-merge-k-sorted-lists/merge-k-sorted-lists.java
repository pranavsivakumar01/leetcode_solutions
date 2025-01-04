class Solution {
    public ListNode merge(ListNode l1,ListNode l2)
    {
         ListNode dummy = new ListNode(-1);
         ListNode temp = dummy;
         while(l1!=null && l2!=null)
         {
            if(l1.val<=l2.val)
            {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next; 
            }
         }
         while(l1!=null)
         {
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
         }
        while(l2!=null)
         {
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
         }
         return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists)
    {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode mergedList = lists[0];
        for (int i = 1; i < lists.length; i++) {
            mergedList = merge(mergedList, lists[i]);
        }

        return mergedList;
    }
}