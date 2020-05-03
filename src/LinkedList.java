
public class LinkedList {
	
	ListNode head;
	
	public void addAtTail(int val) {
		ListNode node = new ListNode(val);
		if(head == null) {
			head =  node;
		} else {
			ListNode current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
	}
	
	public ListNode get(int value) {
		ListNode current = head;
        while (current != null) {
        	if(value == current.val ) {
        		return current;
        	}
        	current = current.next;
        }
        return null;
	}
	
	public void printList(ListNode node) {
		ListNode current = node;
		while(current != null) {
			System.out.print(current.val + " -> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public ListNode create(int[] vals) {
		for(int val: vals) {
			addAtTail(val);
		}
		return head;
	}

}
