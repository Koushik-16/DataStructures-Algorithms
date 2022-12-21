package questions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class CourseSchedule3 {
	
	public static int scheduleCourses(int [][]courses) {
		Arrays.sort(courses,(a,b)-> {
		  return a[1] == b[1] ? a[0] - b[0] : a[1] - b[1];	
		});
		int time = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
		for(int course[] : courses) {
			if(course[0] > course[1]) continue;
			else {
				if(time + course[0] <= course[1]) {
					pq.add(course[0]);
					time += course[0];
				}else {
					if(pq.peek() > course[0]) {
					  time -= pq.poll();
					  time += course[0];
					  pq.add(course[0]);
					}
				}
			}
		}
		return pq.size();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
