
public class ReverseBetween {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int[] data = {1,2,3,4,5}; int m = 2; int n = 4;
		ListNode head = list.create(data);	
		ReverseBetween obj = new ReverseBetween();
		ListNode result = obj.reverseBetween(head, m, n);
		list.printList(result); // 1->4->3->2->5
	}
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
		 ListNode temp = new ListNode(0);
	        temp.next = head;
	        ListNode prev = temp;
	        
	        for(int i=0; i<m-1; i++){
	           prev = prev.next;
	        }
	        
	        ListNode start = prev.next;
	        ListNode current = start.next;
	        
	        for(int i=m; i<n; i++){
	            ListNode hold = current.next;            
	            
	            current.next = prev.next;
	            prev.next = current;

	            start.next = hold;
	            
	            current = hold;           
	        }
	        return temp.next;
    }

}
