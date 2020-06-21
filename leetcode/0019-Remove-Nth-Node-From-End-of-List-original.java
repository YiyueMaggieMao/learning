/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();
        ListNode currNode = head;
        
        // Go ahead and figure out how long the linked list is
        while( currNode != null ){
            length++;
            nodes.add(currNode);
            currNode = currNode.next;
        }
        
        // Edge case : removed node is head
        if(length - n < 1){return head.next;}
        
        ListNode parentOfRemoved = nodes.get(length - n - 1);
        parentOfRemoved.next = parentOfRemoved.next.next;
        
        return head;
    }
}