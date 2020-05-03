
public class DeleteDupLeaveDistinct {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int[] data = {1,2,3,3,4,4,5};
		ListNode head = list.create(data);	
		DeleteDupLeaveDistinct obj = new DeleteDupLeaveDistinct();
		ListNode result = obj.deleteDuplicates(head);
		list.printList(result); // 1 -> 2 -> 5
		
		System.out.println();
		
		LinkedList list1 = new LinkedList();
		int[] data1 = {1,1,1,2,3};
		ListNode head1 = list1.create(data1);	
		ListNode result1 = obj.deleteDuplicates(head1);
		list1.printList(result1); // 2 -> 3
	}
	
    // slow - last node before the duplicate nodes
    // fast - last node of the duplicate nodes
    public ListNode deleteDuplicates(ListNode head) {        
        if(head == null || head.next == null) return head;        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy; ListNode fast = head;
        
        while( fast != null) {
            /// move fast to the last of same data nodes
            while(fast.next != null && fast.val == fast.next.val) { 
                fast = fast.next;
            }
            if(slow.next != fast) { // duplicate chunk
                slow.next = fast.next;
                fast = slow.next; // adjust the fast pointer
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return dummy.next;
        
    }

}
