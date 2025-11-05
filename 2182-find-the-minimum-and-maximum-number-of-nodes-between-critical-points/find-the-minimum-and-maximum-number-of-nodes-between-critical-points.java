/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null||head. next== null|| head.next.next==null)
         return new int[] {-1,-1};
         ListNode prev= head; 
         int index=1;
         ListNode curr= head.next;
         int first=-1;
         int last=-1;
        int prevCritical=-1;
         int minDist=Integer.MAX_VALUE;

         while(curr.next!=null){
            int nextval=curr.next.val;
            if((curr.val>prev.val && curr.val>nextval)|| curr.val<prev.val&&curr.val<nextval) {
                if(first==-1)
                first= index;
                if(prevCritical!=-1)
                minDist=Math.min(minDist,index-prevCritical);
                prevCritical= index;
                last= index;
            }
            prev =curr;
            curr= curr.next;
            index++;
         }
         if(first== last) return new int[]{-1,-1};

         return new int[]{minDist,last-first};

        
    }
}