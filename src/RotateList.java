/* Q3 Given a linked list, rotate the list to the right by k places, where k is non-negative.

Example 1:

Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL
Example 2:

Input: 0->1->2->NULL, k = 4
Output: 2->0->1->NULL
Explanation:
rotate 1 steps to the right: 2->0->1->NULL
rotate 2 steps to the right: 1->2->0->NULL
rotate 3 steps to the right: 0->1->2->NULL
rotate 4 steps to the right: 2->0->1->NULL */
public class RotateList {
	
	public ListNode rotateRight(ListNode head, int k) {
       if( head == null || k == 0) return head;
     // assign head to a temporary current node   
        ListNode current = head;
        int length = 1; // initialize length of list 
        
     // calculate length of list   
        while(current.next != null){
            current = current.next;
            length++;
        }
        
        current.next = head;
   //if k is greater than the length of list rotate by length     
        k = k % length;
        
        for(int i = 0; i < length - k; i++){
            current = current.next;
        }
        
        head = current.next;
        current.next = null;
        return head; 
        
    }
	    
}
