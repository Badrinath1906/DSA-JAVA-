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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(100);
        ListNode prev = dummy;
         dummy.next = head;
         while( prev.next!=null && prev.next.next!=null ){
            ListNode curr = prev.next;
            ListNode after = prev.next.next;

            //swapping the node
            curr.next = after.next;
            after.next = curr; 
            prev.next = after;

              // move prev....
              prev = curr;
         }
         return dummy.next;
        
    }
}