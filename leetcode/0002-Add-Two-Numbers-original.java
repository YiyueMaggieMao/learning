/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result;
        int carryOut = 0;
        
        // Initialize the first value in the result
        int sum = l1.val + l2.val;
        result = new ListNode( sum % 10 );
        carryOut = sum / 10;
        l1 = l1.next; // Move on to the next elements
        l2 = l2.next;
        
        // Continue going in the list until we reach the end of both lists
        ListNode currNode = result;
        ListNode newNode = null;
        while( l1 != null || l2 != null ){
            sum = carryOut;
            
            // As long as l1 is not null, add the digit in l1
            if( l1 != null ){
                sum += l1.val;
                l1 = l1.next;
            }
            
            // Do the same for l2
            if( l2 != null ){
                sum += l2.val;
                l2 = l2.next;
            }
            
            // Add new node and move on to next
            newNode = new ListNode( sum % 10 );
            carryOut = sum / 10;
            currNode.next = newNode;
            currNode = currNode.next;
        }
        
        // In case there is a carryOut...
        if( carryOut != 0 ){
            newNode = new ListNode( carryOut );
            currNode.next = newNode;
            currNode = currNode.next;
        }
        return result;
    }
}