/* Q4 Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example 1:

Input: 1->2->3->4->5->NULL
Output: 1->3->5->2->4->NULL
Example 2:

Input: 2->1->3->5->6->4->7->NULL
Output: 2->3->6->7->1->5->4->NULL */
public class OddEvenList {
	
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
	        
        ListNode odd = head;
	    ListNode even = head.next;
	    ListNode evenStart = head .next;
	        
	    while(even != null && even.next != null){
	        odd.next = even.next;
	        odd = odd.next;
	        even.next = odd.next;
	        even = even.next;
	    }
	        
	    odd.next = evenStart;
	    return head;
	}
}
