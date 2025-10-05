/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;

        while(fast!=null){
            slow=slow.next;
            if(fast.next==null) return null;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        ListNode temp= head;
        while(temp!=slow){
            if(slow==null) return null;
            slow= slow.next;
            temp=temp.next;
        }
        return slow;
        
    }
}