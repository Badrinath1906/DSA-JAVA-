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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer>list = new ArrayList<>();
        ListNode temp = head;
        if(head==null) return null;
        while(temp!=null){
            list.add(temp.val);
            temp= temp.next;
        }
        Collections.sort(list);
        //Rebuild..
        temp = head;
        for(int num:list){
            temp.val = num;
            temp = temp.next;
        }
        return head;

        
    }
}