package greedyAlgorithm;

import java.util.Arrays;

public class VideoSteeching {
	
	 public int videoStitching(int[][] clips, int time) {
	        Arrays.sort(clips, (o1, o2) -> o1[0] == o2[0] ? (o2[1] - o1[1]) : (o1[0] - o2[0]));
	        
	        int prv=0, end=0, cnt = 0;
	        for (int[] clip : clips) {
	            if (clip[0] > end) return -1;
	            
	            if (clip[0] <= prv)
	                end = Math.max(end, clip[1]);
	            else {
	                ++cnt;
	                prv = end;
	                end = Math.max(end, clip[1]);
	            }
	            
	            if (end >= time) return cnt+1;
	        }
	        
	        return -1;
	    }

	public static void main(String[] args) {
		

	}

}
