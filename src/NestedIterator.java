import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* Q10
Given a nested list of integers, implement an iterator to flatten it.

Each element is either an integer, or a list -- whose elements may also be integers or other lists.

Input: [[1,1],2,[1,1]]
Output: [1,1,2,1,1]
Explanation: By calling next repeatedly until hasNext returns false, 
             the order of elements returned by next should be: [1,1,2,1,1].

Input: [1,[4,[6]]]
Output: [1,4,6]
Explanation: By calling next repeatedly until hasNext returns false, 
             the order of elements returned by next should be: [1,4,6].
*/
public class NestedIterator implements Iterator<Integer> {
	Stack<NestedInteger> stack;

	public NestedIterator(List<NestedInteger> nestedList) {
		stack = new Stack<>();
		for (int i = nestedList.size() - 1; i >= 0; i--) {
			stack.push(nestedList.get(i));
		}

	}

	@Override
	public Integer next() {
		return stack.pop().getInteger();
	}

	@Override
	public boolean hasNext() {
		while (!stack.isEmpty()) {
			if (stack.peek().isInteger()) {
				return true;
			} else {
				List<NestedInteger> list = stack.pop().getList();
				for (int i = list.size() - 1; i >= 0; i--) {
					stack.push(list.get(i));
				}
			}

		}
		return false;

	}
}

 // This is the interface that allows for creating nested lists. // You should
  // not implement it, or speculate about its implementation 
  interface NestedInteger {
	 
	  // @return true if this NestedInteger holds a single integer, rather than a
	  //nested list. 
	  public boolean isInteger();
	 
	  // @return the single integer that this NestedInteger holds, if it holds a
	  //single integer // Return null if this NestedInteger holds a nested list
	  public Integer getInteger();
	 
	  // @return the nested list that this NestedInteger holds, if it holds a
	  // nested list // Return null if this NestedInteger holds a single integer
	  public List<NestedInteger> getList();
	  
  }
 