package maps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LongestSequence {
	
	public static void LongestSequence(int [] a ) {
	  HashMap<Integer, Boolean> hm = new HashMap<>();
	  for(int val : a) {
		  hm.put(val, true);
	  }
	  for(int val : a) {
		  if(hm.containsKey(val-1)) {
			  hm.put(val , false);
		  }
	  }
	  int msp = 0;
	  int ml = 0;
	  for(int val : a) {
		 if( hm.get(val) == true) {
			 int tl = 1;
			 int tsp = val;
			 while(hm.containsKey(tsp +1)) {
				tl++; 
			 }
			 if(tl > ml ) {
				 msp = tsp ;
				 ml = tl;
			 }
		 } 
	  }
	  for(int i = 0 ; i < ml; i++) {
		  System.out.println(msp+1);
	  }
	}
	
	public static int LongestConsequtiveSubsequence(int [] a,int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0 ; i < n; i++) {
			pq.add(a[i]);
		}
		
		int prev = pq.poll();
		int c = 1;
		int max = 1;
		
		for(int i = 1 ; i < n; i++) {
			if(pq.peek() - prev > 1) {
				c = 1;
				prev = pq.poll() ;
			}
			else if(pq.peek() - prev == 0) {
				prev = pq.poll() ;
				
			} else {
				c++;
				prev = pq.poll();
			}
			if(max < c) {
				max = c;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int a [] = {1, 9, 3, 10, 4, 20, 2};
		LongestSequence(a);
	}

}
