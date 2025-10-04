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
        ListNode tempA= headA;
        ListNode tempB= headB;
        int size1=0;
        while(tempA!=null){
            size1++;
            tempA=  tempA.next;
        }
         int size2= 0;
        while(tempB!=null){
            size2++;
            tempB=  tempB.next;
        }
        tempA =  headA;
        tempB =  headB;
        if(size1>size2){
            int steps=size1-size2;
            for( int i=1; i<=steps;i++){
                tempA= tempA.next;
              } 
        }
         else{
            int steps=size2-size1;
            for( int i=1; i<=steps;i++){
                tempB= tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
        
        
    }
}