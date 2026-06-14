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
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        temp = head;
        int[] nums = new int[n];
        int MaxTwinSum = 0;
        
        for (int i = 0; i < n; i++) {
            nums[i] = temp.val;
            temp = temp.next;
        }

        for (int i = 0; i < n / 2; i++) {
            int CurrSum = nums[i] + nums[n - 1 - i];
            MaxTwinSum = Math.max(MaxTwinSum, CurrSum);
        }
        return MaxTwinSum;

    }
}