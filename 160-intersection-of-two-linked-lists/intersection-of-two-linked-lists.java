/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int sizeA = 0;
        while (tempA != null) {
            sizeA++;
            tempA = tempA.next;
        }
        int sizeB = 0;
        while (tempB != null) {
            sizeB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if (sizeA > sizeB) {
            int steps = sizeA - sizeB;
            for (int i = 0; i < steps; i++) {
                tempA = tempA.next;
            }
        } else {
            int steps = sizeB - sizeA;
            for (int i = 0; i < steps; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempB;

    }
}