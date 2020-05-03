import java.util.Stack;

/* Q11
	Implement a queue by using two stacks and Optimize poll function(Dequeue() in C#).
	*/
public class Dequeue {
	Stack<Integer> s1;
    Stack<Integer> s2;
    
    public Dequeue() {
        s1 = new Stack<Integer>();//newest on top
        s2 = new Stack<Integer>();//oldest on top
    }
    
    /** Push element x to the back of queue. */
    public void add(int data) {
          s1.push(data);
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int poll() {
       shiftElements();
       return s2.pop();
    }
    
    public int getCount() {
       int count = s1.size() + s2.size();
       return count;
    }

    
    private void shiftElements() {
        if(s2.isEmpty()){
          while(!s1.isEmpty()){
              s2.push(s1.pop());
          }
       } 
    }

}
