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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode temp= head;
        ListNode dummyOdd=new ListNode(100);
        ListNode dummyEven=new ListNode(1000);
        ListNode tOdd=  dummyOdd;
        ListNode tEven= dummyEven;
        int index=1;

        while(temp!=null){
             if(index % 2 !=0){
                ListNode a = new ListNode(temp.val);
                tOdd.next= a;
                tOdd=a;
                temp =temp.next;
                index++;

             }
             else{
                ListNode a = new ListNode(temp.val);
                tEven.next= a;
                tEven=a;
                temp= temp.next;
                index++;
             }
        }

             tOdd.next=dummyEven.next;
             return dummyOdd.next;
        
    }
}