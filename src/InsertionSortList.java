
public class InsertionSortList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int[] data = {-1,5,3,0,4}; 
		ListNode head = list.create(data);	

		InsertionSortList obj = new InsertionSortList();
		ListNode result = obj.insertionSortList(head);
		list.printList(result); // -1 -> 0 > 3 -> 4 -> 5
	}
	
	
    // Node to be inserted between prev and prev.next
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy; 
        ListNode current = head;
        ListNode next = null; 
        
        while(current != null) {
            next = current.next; // remaining list to be examined
            while( prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            current.next = prev.next;  
            prev.next = current;
            prev = dummy; // reset start to head
            current = next; // advance to the next node to be examined    
        }
        return dummy.next;
    }

}
