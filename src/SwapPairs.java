
public class SwapPairs {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int[] data = {1,2,3,4};
		ListNode head = list.create(data);
		
		SwapPairs obj = new SwapPairs();
		ListNode result = obj.swapPairs(head);
		list.printList(result); // 2 -> 1 -> 4 -> 3

	}
	
    
    // previous -> previous of the node to-be-swapped
    public ListNode swapPairs(ListNode head) {
    	 if(head == null || head.next == null) return head;
         ListNode temp = new ListNode(0);
         temp.next = head;
         ListNode prev = temp;
         
         while(prev.next != null && prev.next.next != null){
             // variable allocating to nodes
             ListNode n1 = prev.next;
             ListNode n2 = prev.next.next;
             
             //swap
             prev.next = n2;
             n1.next = n2.next;
             n2.next = n1;
             
             // repeat
              prev = n1;
        }
         return temp.next;
    }

}
