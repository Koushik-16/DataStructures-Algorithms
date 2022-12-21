package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class NMeetingsInARoom {
	
	static class Meeting {
		int index;
		int start;
		int end;
		Meeting(){};
		Meeting(int index , int start , int end){
			this.start = start ;
			this.end = end;
			this.index = index;
		}
	}
	
	public static void maxMeeting(int start [], int end []) {
		ArrayList<Meeting> meet = new ArrayList<>();
		for(int i =0; i < start.length ; i++) {
			meet.add(new Meeting(i,start[i],end[i]));
		}
		Collections.sort(meet,(a,b) -> {
			if(a.end == b.end) return a.index - b.index;
			else return a.end - b.end;
		});
		int currTime = 0;
		for(int i = 0 ; i < meet.size() ; i++) {
			if(currTime < meet.get(i).start) {
				System.out.print(meet.get(i).index + " ");
				currTime = meet.get(i).end;
			}
		}
		
	}

	public static void main(String[] args) {
	
	}

}
