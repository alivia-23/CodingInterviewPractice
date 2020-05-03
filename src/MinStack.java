import java.util.Stack;

/* Q5
	Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
	
	push(x) -- Push element x onto stack.
	pop() -- Removes the element on top of the stack.
	top() -- Get the top element.
	getMin() -- Retrieve the minimum element in the stack.
	
	MinStack minStack = new MinStack();
	minStack.push(-2);
	minStack.push(0);
	minStack.push(-3);
	minStack.getMin();   --> Returns -3.
	minStack.pop();
	minStack.top();      --> Returns 0.
	minStack.getMin();   --> Returns -2.
	*/
	/** initialize your data structure here. */
public class MinStack {
	Stack<Integer> s1;
    Stack<Integer> s2;
    
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>(); 
        s2.push(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
        s1.push(x);
        if( x <= s2.peek()){
            s2.push(x);
        }
    }
    
    public void pop() {
        if(s1.peek() == getMin()){
          s2.pop();
        }
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }


}
