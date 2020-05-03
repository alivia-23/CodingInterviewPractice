import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
	/* Q8
	Given a char array representing tasks CPU need to do. It contains capital letters A to Z where different letters represent different tasks.
	Tasks could be done without original order. Each task could be done in one interval. For each interval, CPU could finish one task or just be idle.
	
	However, there is a non-negative cooling interval n that means between two same tasks,
	there must be at least n intervals that CPU are doing different tasks or just be idle.
	
	You need to return the least number of intervals the CPU will take to finish all the given tasks.
	
	Input: tasks = ["A","A","A","B","B","B"], n = 2
	Output: 8
	Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
	*/
public class TaskScheduler {
	public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> taskCountMap = new HashMap<>();
        for(char c: tasks) {
            taskCountMap.put(c, taskCountMap.getOrDefault(c, 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>( (a, b) -> b - a);
        pq.addAll(taskCountMap.values());
        
        int slots = 0;
        while(!pq.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<=n; i++) {
                if(!pq.isEmpty()) {
                    list.add(pq.poll());
                }
            }
            
            for(int i: list) {
                i--;
                if(i > 0) pq.add(i); // still remaining
            }
            slots += pq.isEmpty() ? list.size() : n + 1;
        }
        
        return slots;
    }
}
