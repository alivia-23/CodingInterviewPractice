import java.util.Stack;
/*
Q2
You are given two non-empty linked lists representing two non-negative integers.
The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Follow up:
What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

Example:
Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7
*/

public class AddTwoNumbersList {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode current1 = l1;
	        Stack<Integer> s1 = new Stack<>();
	        
	        while(current1 != null){
	            s1.push(current1.val);
	            current1 = current1.next;
	        }
	        
	        ListNode current2 = l2;
	        Stack<Integer> s2 = new Stack<>();
	        
	        while(current2 != null){
	            s2.push(current2.val);
	            current2 = current2.next;
	        }
	        
	        int sum = 0; ListNode head = null;
	        
	        while(!s1.isEmpty() || !s2.isEmpty() || sum != 0){
	            if(!s1.isEmpty()){
	               sum = sum + s1.pop(); 
	            }
	              
	            if(!s2.isEmpty()){
	               sum = sum + s2.pop();
	            }
	            // add new node of the resulted sum for each operation 
	            ListNode node = new ListNode(sum%10); // if sum = 12 perform (sum%10)then a node of value 2 will be created
	            node.next = head;
	            head = node;
	            sum = sum/10; // now sum = 12/10; i.e. sum = 1 now and again iterate in while loop condition
	        }
	        return head;
	        
	    }

}
