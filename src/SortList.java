/*
Q8
Sort a linked list in O(n log n) time using constant space complexity.
Examples:
Input: 4->2->1->3
Output: 1->2->3->4

Input: -1->5->3->4->0
Output: -1->0->3->4->5
*/
public class SortList {
	public ListNode sortList(ListNode head) {
		//exit condition checking
        if(head == null || head.next == null){
            return head;
        }
        // break list into two lists
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummy = null;
        
        while(fast != null && fast.next != null){
            dummy = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        dummy.next = null;
        
        // sort each lists
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        // merge l1 and l2 by recursion
        return merge(l1, l2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode node = new ListNode(-1);
        ListNode curr = node;
        
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                curr.next = l2;
                l2 = l2.next;
                curr = curr.next;
            }
            else{
                curr.next = l1;
                l1 = l1.next;
                curr = curr.next;
            }
        }
        if(l1 != null){
            curr.next = l1;
        }
        if(l2 != null){
            curr.next = l2;
        }
        
        return node.next;
     }

}
