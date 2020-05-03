
public class RemoveNthFromEnd {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int[] data = {1,2,3,4,5};
		ListNode head = list.create(data);
		
		RemoveNthFromEnd obj = new RemoveNthFromEnd();
		ListNode result = obj.removeNthFromEnd(head, 2);
		list.printList(result); // 1 -> 2 -> 3 -> 5

	}
	
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode start = temp;
        ListNode current = temp;
        
        for (int i=1; i<=n+1; i++) {
            start = start.next;
        }
        while (start != null) {
            start = start.next;
            current = current.next;
        }
        current.next = current.next.next;
        return temp.next;
    }

}
