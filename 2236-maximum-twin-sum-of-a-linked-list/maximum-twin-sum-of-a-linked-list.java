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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int n = 1;
        while (temp.next != null) {
            temp = temp.next;
            n++;
        }
        temp = head;
        Stack<Integer> st = new Stack<>();
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }
        int MaxTwinSum = 0;
        temp = head;
        for (int i = 0; i < n / 2; i++) {
            MaxTwinSum = Math.max(MaxTwinSum, temp.val + st.pop());
            temp = temp.next;

        }
        return MaxTwinSum;

    }
}