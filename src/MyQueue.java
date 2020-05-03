import java.util.Stack;

/* Q3
	Implement the following operations of a queue using stacks.
	
	push(x) -- Push element x to the back of queue.
	pop() -- Removes the element from in front of queue.
	peek() -- Get the front element.
	empty() -- Return whether the queue is empty.
	
	MyQueue queue = new MyQueue();
	queue.push(1);
	queue.push(2);  
	queue.peek();  // returns 1
	queue.pop();   // returns 1
	queue.empty(); // returns false
	*/
public class MyQueue {
	Stack<Integer> s1;
    Stack<Integer> s2;
    
    public MyQueue() {
        s1 = new Stack<Integer>();//newest on top
        s2 = new Stack<Integer>();//oldest on top
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
          s1.push(x);
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       shiftElements();
       return s2.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        shiftElements();
        return s2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();         
    }
    
    private void shiftElements() {
        if(s2.isEmpty()){
          while(!s1.isEmpty()){
              s2.push(s1.pop());
          }
       } 
    }
}
