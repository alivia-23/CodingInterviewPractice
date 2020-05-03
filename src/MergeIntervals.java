import java.util.ArrayList;
/* Q1 Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping. */
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
    	// Exit condition checking
    	if(intervals.length <= 1) {
    		return intervals;
    	}
       // sort the given array of intervals
    	Arrays.sort(intervals, (obj1, obj2) -> Integer.compare(obj1[0], obj2[0]));
    	
    	// Declare a list to store the sorted array of intervals
    	List<int[]> result = new ArrayList();
    	
    	// create a temporary array of intervals to store values of intervals after comparisons
    	//And initialize temp array with 0th index of the given intervals array
    	int[] temp_interval = intervals[0];
    	result.add(temp_interval);
    	
    	// iterate through every index of the given intervals array
    	for (int[] interval : intervals) {
    		
    	// initialize variables for the temp array and each interval in intervals
    		int current_second = temp_interval[1];
    		int next_first = interval[0];
    		int next_second = interval[1];
    	
    	//compare for greater value between 1st interval's 2nd index and next interval's 1st index
    		if(current_second >= next_first) {
    	
       // overwrite temp array at index 1 with the greater value among the two values
    			temp_interval[1] = Math.max(current_second, next_second);
    		}else {
    			// update  temp array with the interval and add to result array
    		    temp_interval = interval;
    		    result.add(temp_interval);
    		}
		}
    	//covert result list to 2D array
    	return result.toArray(new int[result.size()][]);
    }
}
