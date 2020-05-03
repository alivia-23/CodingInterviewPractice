import java.util.Stack;

public class AddTwoNumbers {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		ListNode l1 = list1.create(new int[] {7,2,4,3});
		
		
		LinkedList list2 = new LinkedList();
		ListNode l2 = list2.create(new int[] {5,6,4});
		
		AddTwoNumbers obj = new AddTwoNumbers();
		ListNode result = obj.addTwoNumbers(l1, l2);
		list1.printList(result); // 7 -> 8 -> 0 -> 7
	
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	 ListNode current1 = l1;
         Stack<Integer> s1 = new Stack<>();
         
         while(current1 != null){
             s1.push(current1.val);
             current1 = current1.next;
         }
         
         ListNode current2 = l2;
         Stack<Integer> s2 = new Stack<>();
         
         while(current2 != null){
             s2.push(current2.val);
             current2 = current2.next;
         }
         
         int sum = 0; ListNode head = null;
         
         while(!s1.isEmpty() || !s2.isEmpty() || sum != 0){
             if(!s1.isEmpty()){
                sum = sum + s1.pop(); 
             }
               
             if(!s2.isEmpty()){
                sum = sum + s2.pop();
             }
             ListNode node = new ListNode(sum%10);
             node.next = head;
             head = node;
             sum = sum/10;
         }
         return head;
    }

}
