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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp= head;
        int n=0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        int group =n/k;
        ListNode prevHead= null;
        ListNode currHead = head;
        ListNode ansNode  = null;

        for(int i=0;i<group;i++){
        ListNode curr = currHead;
        ListNode prev =null;
        ListNode after = null;
            for(int j=0;j<k;j++){
                after  =curr.next;
                curr.next = prev;
                prev = curr;
                curr = after;

            }
           if(prevHead==null)  ansNode = prev;
           else prevHead.next =prev;

           prevHead=currHead;
           currHead= curr;
        } 
        prevHead.next = currHead;  
        return ansNode;     
        
    }
}