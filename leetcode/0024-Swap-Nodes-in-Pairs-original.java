/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
         // Edge case for 0 or 1 elements in the node
        if(head==null){return null;}
        if(head.next==null){return head;}
        
        boolean newHeadSet = false;
        ListNode newHead = null;
        ListNode currNode = head;
        ListNode parent = null;
        
        while( currNode != null ){
            if(currNode.next==null){break;}
            ListNode temp = currNode; // 3
            ListNode tempNext = temp.next; // 4
            // currNode.next.next = tempNext;
            ListNode currNext = currNode.next;
            ListNode currNextNext = currNode.next.next; // null
            currNode = currNext;
            if(parent != null){parent.next = currNode;}
            currNode.next = temp;            

            currNode.next.next = currNextNext;

            // Tries to set the new head
            if( !newHeadSet ){
                newHead = currNode;
                newHeadSet = true;
            }

            parent = currNode.next;
            currNode = currNode.next.next;
        }
        
        return newHead;
    }
}