class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Edge case: If head is null or length of list less than k
        if( head==null ){return null;}
        ListNode currNode = head;
        for(int i = 0; i < k-1; i++){
            if(currNode.next == null){return head;}
            currNode = currNode.next;
        }

        // Now we do the actual swapping...
        ListNode currHead = head; // The original first node in current group
        ListNode newHead; // The first node after current group
        currNode = head;
        int ind = 0;
        ListNode nodeToReturn = null;
        ListNode newTail = null;

        while(currNode != null){
            System.out.println("currNode: " + currNode.val);
            if(currNode.next !=null){
                System.out.println("currNode.next: " + currNode.next.val);
            }
            if(ind == 0){newTail = currNode;}
            // Does the actual swapping at the last ind if we reach it
            if(ind == k - 1){
                if(nodeToReturn==null){nodeToReturn=currNode;}
                newHead  = currNode.next; 
                System.out.println("new Head: "+newHead.val);
                ListNode currTemp = null;
                
                // Revert each and every node in the group 
                for(int i = ind; i > 0; i--){
                    currTemp = newTail; // This variable should hold
                                                  // the node to be reverted
                    for(int j = 0; j < i-1; j++){
                        currTemp = currTemp.next;
                    }

                    ListNode parent = currNode;
                    for(int l = ind; l > i; l--){
                        parent = parent.next;
                    }

                    parent.next = currTemp;
                    System.out.println("parent: " + parent.val);
                    System.out.println("currTemp: " + currTemp.val);
                }
                currTemp.next = newHead;
                currNode = newHead;
                ind = 0;
            }else{
                ind++;
                currNode = currNode.next;
            }
        }
        System.out.println("nodeToReturn: " + nodeToReturn.val);
        System.out.println("nodeToReturn.next: " + nodeToReturn.next.val);
        return nodeToReturn==null? nodeToReturn:head;
    }
}