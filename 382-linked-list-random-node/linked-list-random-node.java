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
import java.util.*;

class Solution {
    ListNode head;
    Random random;

    public Solution(ListNode head) {
        this.head = head;
        this.random = new Random();

    
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public int getRandom() {
        ListNode curr = head;
        int result = curr.val;
        int count = 1;

        while (curr != null) {
            // each node has 1/count chance to be picked
            if (random.nextInt(count) == 0) {
                result = curr.val;
            }
            curr = curr.next;
            count++;
        }
        return result;
    }
}


/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */