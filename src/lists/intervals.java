package lists;
import java.util.ArrayList;
import java.util.Collections;
public class intervals {
	
	
static class Interval {
	     int start;
	     int end;
	    Interval(){
	    	
	    }
	    Interval(int s , int e){
	    	this.start = s;
	    	this.end = e;
	    }
	 }
	 
 public static  ArrayList<Interval> mergeInterval(ArrayList<Interval> intervals) {
		 
	 if(intervals.size() < 2) {
		 return intervals;
	 }
	 ArrayList<Interval> output = new ArrayList<>();
	 
	 Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
	 Interval temp = intervals.get(0);
	 int start = temp.start;
	 int end = temp.end;
	 for(int i = 0; i< intervals.size(); i++) {
		 temp = intervals.get(i);
		 if(temp.start <= end) {
			 end = Math.max(end, temp.end);	  
		 } else {
			 output.add(new Interval(start,end));
			  start = temp.start;
			  end = temp.end;
		 }
	 }
	 output.add(new Interval(start, end));
	 return output;
	 }
 public static void main(String [] args) {
	 
	 
 }
 
 
 }

