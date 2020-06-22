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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode node = null; // Node to be returned
        
        // Keep track of the lengths of the lists
        int arrlen = lists.length;
        int[] lengths = new int[arrlen];
        
        // Keep track of the indices in arrays
        int[] inds = new int[arrlen];
        Arrays.fill(inds, 0);
        
        // Convert the lists into ArrayLists and initialize lengths
        ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
        for(int i = 0; i < arrlen; i++){
            ListNode list = lists[i];
            ArrayList<Integer> currList = new ArrayList<Integer>();
            ListNode currNode = list;
            int currLen = 0;
            while(list != null){
                currList.add(list.val);
                list = list.next;
            }
            nums.add(currList);
            lengths[i] = currList.size();
        }
        
        boolean running = true;
        while(running){
            running = false; // Will become true if any list is not at its end yet
            int min = Integer.MAX_VALUE; // Will eventually hold the min value of current round
            int minList = -1; // The list containing the current lowest value
            
            // Find the min value and its list ind
            for(int i = 0; i < arrlen; i++){
                ArrayList<Integer> currArr = nums.get(i);
                int currInd = inds[i];
                if(currArr.size() <= currInd){continue;}
                if(!running && currArr.size()> currInd){running = true;} // Update running logic
                int currVal = currArr.get(currInd);
                if(currVal < min){
                    min = currVal;
                    minList = i;
                }
            }
            
            // Update the list and increment the corresponding ind
            if(running){
                if(node == null){node = new ListNode(min);}
                else{
                    ListNode currNode = node;
                    while(currNode.next != null){currNode = currNode.next;}
                    currNode.next = new ListNode(min);
                }
                System.out.println("min: " + min);
                System.out.println("minList: " + minList);
                inds[minList]= inds[minList]+1;
            }
        }
        return node;
    }
}