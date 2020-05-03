
public class DeleteDuplicates {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int[] data = {1,1,2};
		ListNode head = list.create(data);	
		DeleteDuplicates obj = new DeleteDuplicates();
		ListNode result = obj.deleteDuplicates(head);
		list.printList(result); // 1 -> 2
		
		System.out.println();
		
		LinkedList list1 = new LinkedList();
		int[] data1 = {1,1,2,3,3};
		ListNode head1 = list1.create(data1);	
		ListNode result1 = obj.deleteDuplicates(head1);
		list1.printList(result1); // 1 -> 2 -> 3
	}
	
	
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode current = head;
        while(current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
