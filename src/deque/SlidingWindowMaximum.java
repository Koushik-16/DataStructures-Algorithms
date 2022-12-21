package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
	
	 public static  int[] maxSlidingWindow(int[] nums, int k) {
		 int n = nums.length;
		 int res [] = new int [n - k + 1]; 
		 int ri = 0;
		 Deque<Integer> dq = new ArrayDeque<>();
		 for(int i = 0 ;i < nums.length ;i++) {
			 if(!dq.isEmpty() && dq.peek() == i -k) dq.poll();
			 while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
			 dq.offer(i);
			 if(i >= k-1) res[ri++] = nums[dq.peek()];
		 }
		 return res;
	    }

	public static void main(String[] args) {
		

	}

}
