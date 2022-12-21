package lists;

import java.util.ArrayList;

class Interval {
	int start;
	int end;
	
	Interval(){
		
	}
	
	Interval(int start , int end){
		this.start = start;
		this.end = end;
	}
	
}

public class Solution {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
	       if(intervals.size() == 0){
	           intervals.add(newInterval);
	           return intervals;
	       }
	       int i = 0;
	         while(i < intervals.size()){
	            Interval curr = intervals.get(i);
	          if(curr.end < newInterval.start){
	               i++;
	               continue;
	          }
	          else if(newInterval.end < curr.start){
	                 intervals.add(i,newInterval);
	                 break;
	          }else {
	                 newInterval.start = Math.min(curr.start,newInterval.start);
	                 newInterval.end = Math.max(curr.end,newInterval.end);
	                 intervals.remove(i);
	          }
	       }
	       if(i == intervals.size()) intervals.add(newInterval);
	       return intervals;
	    }
}
