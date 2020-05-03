
public class DeleteNode {
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int[] data = {4,5,1,9};
		ListNode head = list.create(data);	
		ListNode nodeToDelete = list.get(5);
		DeleteNode obj = new DeleteNode();
		obj.deleteNode(nodeToDelete);
		list.printList(head); // 4 -> 1 -> 9
	}
	
	
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
