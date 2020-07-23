<h1>LeetCode Notes</h1>
<p>Hello there! This file contains my notes regarding the techniques that I encountered while LeetCoding. It's more of a personal refernece, and might take a while to be fleshed out, but I will jot more down as I go!</p>

<h2 id="content">Content</h2>
<ul>
    <li><a href="#backtracking">Backtracking</a></li>
    <li><a href="#hashing">Hashing</a></li>
    <li><a href="#linked-list-strategies">Linked List Strategies</a></li>
    <li><a href="#two-pointers">Two Pointers</a></li>
</ul>

<!--------------------------------------------- Backtracking ----------------------------------------------------->
<h2 id="backtracking">Backtracking</h2>
<p>Backtracking is often used when we want to find solution(s) that satisfies some constraint. In a recursive fashion, it tries out one of the remaining possible options one step at a time, and upon failure, tries out a different possible option. </p>

<h3>Examples</h3>
<ul>
    <li><a href="https://leetcode.com/problems/sudoku-solver/">0037- Sudoku Solver</a>. Pretty typical backtracking problem. The possible options for each grid is everything that's not in its row, column, or box AND hasn't already been eliminated due to a previous failure.<a href="https://leetcode.com/problems/sudoku-solver/discuss/707726/Java-Backtracking-Simple-Solution"> reference solution</a></li>
</ul>

<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Hashing ----------------------------------------------------->
<h2 id="hashing">Hashing</h2>
<p>Hashing is often used when we want to distinguish objects into different groups based on a specific characteristic. We use that specific characteristic to choose the <b>key</b> of the hashtable, and the <b>value</b> is typically an array containing every entry that matches the category as described by the key. </p>

<h3>Advantage</h3>
<p>Hashtables allow us to retrieve / store values in <b>O(1)</b> time as long as we have figured out the hash key. Instead of going exhaustively through every entry to find a match, we can just look up the hash key to insert it in constant time.</p>

<h3>Examples</h3>
<ul>
    <li><a href="https://leetcode.com/problems/group-anagrams/">0049- Group Anagrams</a>. In this question, we want to sort the words into groups of anagrams. Instead of checking character for character with each word, we can sort the words in alphabetical order and use the sorted word as a hash key (<a href="https://leetcode.com/problems/group-anagrams/discuss/715869/java-hashmap-easy-solution">reference solution 1</a>) . Alternatively, we can use the frequencies of each character in a word as a hash key, which will be faster than the previous solution, but take up more space since we will use arrays of length 26 for each key (<a href="https://leetcode.com/problems/group-anagrams/discuss/715869/java-hashmap-easy-solution">reference solution 2</a>) .</li> 
</ul>

<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Linked List ------------------------------------------------------>
<h2 id="linked-list-strategies">Linked List Strategies</h2>
<p>When approaching questions involving linked lists, especially those dealing with changing orders of the elements, it's convenient to have a <b>dummy node</b> whose next node is the head of the linked list. Also, if the problem has to deal with reversing, simply keep track of the nodes <code>prev</code>, <code>curr</code>, and <code>next</code>, and reverse the direction of the link.</p>

<h3>Advantage</h3>
<p>Without using a dummy node, we will need to separate the cases that change the head node and deal with them independently. However, with a dummy node, we can simply return <code>dummy.next</code>, and therefore not having to separately consider the cases where the head node changes, saving the run time and having cleaner code as a result.</p>

<h3>Example</h3>
<ul>
    <li><a href="https://leetcode.com/problems/reverse-nodes-in-k-group/">0025 - Reverse Nodes in K-Group</a>. This is a straightforward example utilizing both techniques mentioned. Instead of dealing with the reverse separately (because it will change the head node), we just keep the dummy node as a previous tail, so we can just assign <code>dummy.next</code> to be the orignial kth node of the list, after the first group is reversed (<a href="https://leetcode.com/problems/reverse-nodes-in-k-group/discuss/183356/Java-O(n)-solution-with-super-detailed-explanation-and-illustration">reference solution 2</a>).</li>
</ul>

<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Two Pointers ----------------------------------------------------->
<h2 id="two-pointers">Two Pointers</h2>
<p>Two pointers is typically used when we need to traverse an array to find a pair of indices or values. In order for use two-pointers, we need to have a <b>sorted array</b>, and use two pointers pointing to different indices to traverse the array.</p>

<h3>Advantage</h3>
<p>While brute forcing will take <b>quadratic</b> time, the two-pointers approach will take <b>O(n)</b> time.</p>

<h3>Examples</h3>
<ul>
    <li><a href="https://leetcode.com/problems/container-with-most-water/">0011- Container with Most Water</a>. In order to find the best area, we start one pointer at index <code>0</code> and the other at <code>n-1</code> (n being the length of the array). Then until the two pointers meet, we move the pointer pointing to the shorter line by one index towards the center. <a href="https://leetcode.com/problems/container-with-most-water/discuss/713778/Java-Easy-Solution-O(n)">reference solution</a></li>
    <br/>
    <li><a href="https://leetcode.com/problems/3sum/">0015- 3Sum</a>. We sort the array, then for each index <code>ind</code> from <code>0</code> to <code>n-3</code> (n being the length of the array), we keep two pointers <code>left</code> and <code>right</code>, starting at indices <code>ind + 1</code> and <code>n - 1</code> respectively. Until the two pointers meet or the sum matches exactly with the target, we increment <code>left</code> by 1 if <code>arr[left] + arr[right] < target</code>, and decrement <code>right</code> by 1 otherwise. <a href="https://leetcode.com/problems/3sum/discuss/712424/JAVA-O(n2)">reference solution</a></li></li>
</ul>
<a href="#content">Back to Content</a>