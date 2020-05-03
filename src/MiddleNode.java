
public class MiddleNode {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		int[] data = {1,2,3,4,5};
		ListNode head = l1.create(data);
		
		MiddleNode obj = new MiddleNode();
		ListNode middleNode = obj.middleNode(head);
		l1.printList(middleNode); //3 -> 4 -> 5
		
	}
	
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head; ListNode fast = head;
        while(fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
