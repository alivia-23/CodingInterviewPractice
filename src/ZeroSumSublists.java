import java.util.HashMap;
/*
Q1
Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.
After doing so, return the head of the final linked list.  You may return any such answer.
 

(Note that in the examples below, all sequences are serializations of ListNode objects.)

Example:
Input: head = [1,2,-3,3,1]
Output: [3,1]
Note: The answer [1,2,1] would also be accepted.

Input: head = [1,2,3,-3,4]
Output: [1,2,4]

Input: head = [1,2,3,-3,-2]
Output: [1]
*/

public class ZeroSumSublists {
	 public ListNode removeZeroSumSublists(ListNode head) {
		 if(head == null) return null;
		 HashMap<Integer, ListNode> map = new HashMap<>();
	     int sum = 0;
	     ListNode currNode = head;
	     while(currNode != null){
	         sum += currNode.val;
	         if(sum == 0)
	             head = currNode.next;
	         if(map.containsKey(sum)){
	        	 map.get(sum).next = currNode.next;
	             return removeZeroSumSublists(head);
	         }                
	         map.put(sum, currNode);
	         currNode = currNode.next;
	     }
	     return head;
	 }

}
