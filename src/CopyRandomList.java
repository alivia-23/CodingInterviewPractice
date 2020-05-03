import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {

	public static void main(String[] args) {
		
		CopyRandomList obj = new CopyRandomList();
		
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		
		Node head = one;
		
		one.next = two;
		two.next = three;
		
		one.random = three;
		two.random = null;
		three.random = two;
		
		Node clonedHead = obj.copyRandomList(head);
		obj.printAll(clonedHead);

	}
	
	
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Map<Node, Node> map = new HashMap<>();      
        Node clonedHead = new Node(head.val);           
        Node original = head;
        Node cloned = clonedHead;
        map.put(original, cloned);
        
        while( original != null) {
            cloned.next = getClonedNode(map, original.next);
            cloned.random = getClonedNode(map, original.random);
            original = original.next;
            cloned = cloned.next;
        }
        return clonedHead;
    }
    

    private Node getClonedNode(Map<Node, Node> map, Node node) {
        if(node == null) return null;
        if( !map.containsKey(node)) {
            Node clonedNode = new Node(node.val);
            map.put(node, clonedNode);
        }
        return map.get(node);
    } 
    
    
    private void printAll(Node node) {
    	Node current = node;
    	while(current != null) {
    		System.out.print("val: "+ current.val);
    		
    		if(current.next != null ) {
    			System.out.print(",nextVal: "+current.next.val);
    		} else {
    			System.out.print(",nextVal: null");
    		}
    		
    		if(current.random != null ) {
    			System.out.print(",randomVal: "+current.random.val);
    		} else {
    			System.out.print(",randomVal: null");
    		}
    		System.out.print(" -> ");
    		current = current.next;
    	}
    	System.out.print("null");
    }

}
