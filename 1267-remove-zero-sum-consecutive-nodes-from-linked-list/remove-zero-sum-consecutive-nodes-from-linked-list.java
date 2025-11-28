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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer, ListNode> mp = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        int prefSum = 0;
        while (temp != null) {
            prefSum += temp.val;
            mp.put(prefSum, temp);
            temp = temp.next;
        }
        prefSum = 0;
        temp = dummy;
        while (temp != null) {
            prefSum += temp.val;
            temp.next = mp.get(prefSum).next;//imp line..
            temp = temp.next;
        }
        return dummy.next;

    }
}